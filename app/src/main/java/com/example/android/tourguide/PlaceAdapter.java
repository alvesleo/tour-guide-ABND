package com.example.android.tourguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alvesleo on 07/11/16.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private ArrayList<Place> mPlace;


    public PlaceAdapter (ArrayList<Place> place){
        mPlace = place;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mPlaceName;
        public TextView mPlaceSummary;
        public final Context context;

        public ViewHolder(final Context context, View v) {
            super(v);
            mPlaceName = (TextView) v.findViewById(R.id.title_text);
            mPlaceSummary = (TextView) v.findViewById(R.id.description_text);
            this.context = context;
        }

    }

    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itens, parent, false);
        ViewHolder vh = new ViewHolder(context, v);
        return vh;
    }

    @Override
    public void onBindViewHolder(PlaceAdapter.ViewHolder viewHolder, int position) {
        Place currentPlace = mPlace.get(position);

        viewHolder.mPlaceName.setText(currentPlace.getPlaceName());
        viewHolder.mPlaceSummary.setText(currentPlace.getPlaceDescription());
    }

    @Override
    public int getItemCount() {
        return mPlace.size();
    }

}

