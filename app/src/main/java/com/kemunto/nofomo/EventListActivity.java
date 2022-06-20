package com.kemunto.nofomo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;

import com.kemunto.nofomo.adapters.EventListAdapter;
import com.kemunto.nofomo.models.Event;
import com.kemunto.nofomo.models.SeatGeekEventsSearchResponse;
import com.kemunto.nofomo.network.SeatApi;
import com.kemunto.nofomo.network.SeatClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventListActivity extends AppCompatActivity {
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mRecentChoice;

    private static final String TAG = EventListActivity.class.getSimpleName();
    private EventListAdapter mAdapter;
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    public List<Event> occasions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mRecentChoice = mSharedPreferences.getString(Constants.PREFERENCES_TYPE_KEY, null);
        if(mRecentChoice != null){
            fetchOccasions(mRecentChoice);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String type) {
                addToSharedPreferences(type);
                fetchOccasions(type);
                return false;
            }


            @Override
            public boolean onQueryTextChange(String type) {
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showEvents() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

    private void addToSharedPreferences(String type) {
        mEditor.putString(Constants.PREFERENCES_TYPE_KEY, type).apply();
    }


    private void fetchOccasions(String type){
        SeatApi client = SeatClient.getClient();

        Call<SeatGeekEventsSearchResponse> call = client.getOccasions(type);

        call.enqueue(new Callback<SeatGeekEventsSearchResponse>() {
            @Override
            public void onResponse(Call<SeatGeekEventsSearchResponse> call, Response<SeatGeekEventsSearchResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    occasions = response.body().getEvents();
                    mAdapter = new EventListAdapter(EventListActivity.this, occasions);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(EventListActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    showEvents();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<SeatGeekEventsSearchResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ",t );
                hideProgressBar();
                showFailureMessage();
            }

        });
    }

}