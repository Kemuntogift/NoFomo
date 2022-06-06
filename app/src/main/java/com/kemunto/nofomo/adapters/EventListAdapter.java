package com.kemunto.nofomo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.kemunto.nofomo.R;
import com.kemunto.nofomo.models.Event;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> {
    private List<Event> mOccasions;
    private Context mContext;

    public EventListAdapter(Context context, List<Event> occasions) {
        mContext = context;
        mOccasions = occasions;
    }

    @Override
    public EventListAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventListAdapter.EventViewHolder holder, int position) {
        holder.bindOccasion(mOccasions.get(position));
    }

    @Override
    public int getItemCount() {
        return mOccasions.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.eventImageView)
        ImageView mEventImageView;
        @BindView(R.id.eventTitleTextView)
        TextView mEventTitleTextView;
        @BindView(R.id.performersTextView) TextView mPerformersTextView;
        @BindView(R.id.statsTextView) TextView mStatsTextView;

        private Context mContext;

        public EventViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindOccasion(Event occasion) {
            mEventTitleTextView.setText(occasion.getTitle());
            mPerformersTextView.setText(occasion.getPerformers().get(0).getName());
        }
    }
}
