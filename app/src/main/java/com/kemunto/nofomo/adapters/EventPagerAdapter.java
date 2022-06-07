package com.kemunto.nofomo.adapters;

import android.support.annotation.NonNull;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.kemunto.nofomo.EventDetailFragment;
import com.kemunto.nofomo.models.Event;


import java.util.ArrayList;
import java.util.List;

public class EventPagerAdapter extends FragmentPagerAdapter {
    private List<Event> mOccasions;

    public EventPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Event> occasions) {
        super(fm, behavior);
        mOccasions = occasions;
    }

    @Override
    public Fragment getItem(int position) {
        return EventDetailFragment.newInstance(mOccasions.get(position));
    }

    @Override
    public int getCount() {
        return mOccasions.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mOccasions.get(position).getTitle();
    }
}

