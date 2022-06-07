package com.kemunto.nofomo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kemunto.nofomo.models.Event;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;


public class EventDetailFragment extends Fragment {
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

        return view;
    }
}