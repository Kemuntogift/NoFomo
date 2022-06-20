package com.kemunto.nofomo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.kemunto.nofomo.models.Event;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;


public class EventDetailFragment extends Fragment implements View.OnClickListener{
    @BindView(R.id.eventImageView) ImageView mImageLabel;
    @BindView(R.id.eventTitleTextView) TextView mNameLabel;
    @BindView(R.id.performersTextView) TextView mPerformersLabel;
    @BindView(R.id.websiteTextView) TextView mWebsiteLabel;
    @BindView(R.id.addressTextView) TextView mAddressLabel;
    @BindView(R.id.saveEventButton) TextView mSaveEventButton;

    private Event mOccasion;


    public EventDetailFragment() {
        // Required empty public constructor
    }


    public static EventDetailFragment newInstance(Event occasion) {
        EventDetailFragment eventDetailFragment = new EventDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("occasion", Parcels.wrap(occasion));
        eventDetailFragment.setArguments(args);
        return eventDetailFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getArguments() != null;
        mOccasion = Parcels.unwrap(getArguments().getParcelable("occasion"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_event_detail, container, false);
        ButterKnife.bind(this, view);



        mNameLabel.setText(mOccasion.getTitle());
        mPerformersLabel.setText(mOccasion.getPerformers().get(0).getName());
        mWebsiteLabel.setText(mOccasion.getUrl());
        mAddressLabel.setText(mOccasion.getVenue().toString());

        mSaveEventButton.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        if (v == mSaveEventButton) {
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
            String uid = user.getUid();
            DatabaseReference occasionRef = FirebaseDatabase
                    .getInstance()
                    .getReference(Constants.FIREBASE_CHILD_OCCASIONS)
            .child(uid);

            DatabaseReference pushRef = occasionRef.push();
            String pushId = pushRef.getKey();
            mOccasion.setPushId(pushId);
            pushRef.setValue(mOccasion);
            Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
        }
    }
}