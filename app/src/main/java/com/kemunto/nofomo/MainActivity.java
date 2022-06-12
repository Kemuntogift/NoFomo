package com.kemunto.nofomo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ValueEventListener mSearchedTypeReferenceListener;

    private DatabaseReference mSearchedTypeReference;
    @BindView(R.id.searchButton)
    Button mSearchButton;
    @BindView(R.id.typeEditText)
    EditText mTypeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mSearchedTypeReference = FirebaseDatabase
                .getInstance()
                .getReference()
                .child(Constants.FIREBASE_CHILD_SEARCHED_TYPE);

        mSearchedTypeReferenceListener = mSearchedTypeReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot typeSnapshot : dataSnapshot.getChildren()){
                    String type = typeSnapshot.getValue().toString();
                    Log.d("Types updated", "type: " + type);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == mSearchButton) {
            String type = mTypeEditText.getText().toString();
            saveTypeToFirebase(type);
            Intent intent = new Intent(MainActivity.this, EventListActivity.class);
            intent.putExtra("type", type);
            startActivity(intent);
        }
    }
    public void saveTypeToFirebase(String type) {
        mSearchedTypeReference.push().setValue(type);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSearchedTypeReference.removeEventListener(mSearchedTypeReferenceListener);
    }
}