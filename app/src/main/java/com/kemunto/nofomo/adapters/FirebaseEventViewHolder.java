package com.kemunto.nofomo.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.kemunto.nofomo.Constants;
import com.kemunto.nofomo.EventDetailActivity;
import com.kemunto.nofomo.R;
import com.kemunto.nofomo.models.Event;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;

public class FirebaseEventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    View mView;
    Context mContext;

    public FirebaseEventViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mContext = itemView.getContext();
        itemView.setOnClickListener(this);
    }
    public void bindOccasion(Event occasion) {
        ImageView eventImageView = (ImageView) mView.findViewById(R.id.eventImageView);
        TextView eventTitleTextView = (TextView) mView.findViewById(R.id.eventTitleTextView);
        TextView performersTextView = (TextView) mView.findViewById(R.id.performersTextView);

        eventTitleTextView.setText(occasion.getTitle());
        performersTextView.setText(occasion.getPerformers().get(0).getName());

    }
    @Override
    public void onClick(View view) {
        final ArrayList<Event> occasions = new ArrayList<>();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String uid = user.getUid();
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_OCCASIONS).child(uid);
        ref.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    occasions.add(snapshot.getValue(Event.class));
                }

                int itemPosition = getLayoutPosition();

                Intent intent = new Intent(mContext, EventDetailActivity.class);
                intent.putExtra("position", itemPosition + "");
                intent.putExtra("occasions", Parcels.wrap(occasions));

                mContext.startActivity(intent);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}
