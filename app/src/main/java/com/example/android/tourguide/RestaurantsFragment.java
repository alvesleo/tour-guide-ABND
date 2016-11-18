package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.maria_restaurant, R.string.maria_restaurant_summary,
                R.drawable.maria_restaurant));
        places.add(new Place(R.string.bodega_restaurant, R.string.bodega_restaurant_summary,
                R.drawable.bodega_restaurant));
        places.add(new Place(R.string.lopana_restaurant, R.string.lopana_restaurant_summary,
                R.drawable.lopana_restaurant));
        places.add(new Place(R.string.mainha_restaurant, R.string.mainha_restaurant_summary,
                R.drawable.mainha_restaurant));
        places.add(new Place(R.string.parmegiano_restaurant, R.string.parmegiano_restaurant_summary,
                R.drawable.parmegiano_restaurant));

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list_place);
        PlaceAdapter adapter = new PlaceAdapter(places);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
