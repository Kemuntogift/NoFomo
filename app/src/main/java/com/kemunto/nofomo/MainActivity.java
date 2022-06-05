package com.kemunto.nofomo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.searchButton)
    Button mSearchButton;
    @BindView(R.id.eventEditText)
    EditText mEventEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == mSearchButton) {
            String location = mEventEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, EventListActivity.class);
//            intent.putExtra("type", type);
            startActivity(intent);
        }
    }
}