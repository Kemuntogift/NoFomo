package com.kemunto.nofomo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.searchButton)
    Button mSearchButton;
    @BindView(R.id.introduction)
    TextView mIntroduction;
    @BindView(R.id.paragraph) TextView mParagraph;
    @BindView(R.id.savedEventsButton) Button mSavedEventsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchButton.setOnClickListener(this);
        mSavedEventsButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == mSearchButton) {
            Intent intent = new Intent(MainActivity.this, EventListActivity.class);
            startActivity(intent);
        }
        if (v == mSavedEventsButton) {
            Intent intent = new Intent(MainActivity.this, SavedEventListActivity.class);
            startActivity(intent);
        }
    }

}