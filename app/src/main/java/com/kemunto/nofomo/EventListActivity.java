package com.kemunto.nofomo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
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
    private static final String TAG = EventListActivity.class.getSimpleName();

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    private EventListAdapter mAdapter;

    public List<Event> occasions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");

        SeatApi client = SeatClient.getClient();

        Call<SeatGeekEventsSearchResponse> call = client.getOccasions(type);

        call.enqueue(new Callback<SeatGeekEventsSearchResponse>() {
            @Override
            public void onResponse(Call<SeatGeekEventsSearchResponse> call, Response<SeatGeekEventsSearchResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    occasions = response.body().getEvents();
                    mAdapter = new EventListAdapter(EventListActivity.this, occasions);

                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(EventListActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    mRecyclerView.setAdapter(mAdapter);
                    showEvents();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<SeatGeekEventsSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }

        });
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
}