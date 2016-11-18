package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BeachesFragment extends Fragment {

    public BeachesFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.gunga_beach, R.string.gunga_beach_summary,
                R.drawable.gunga_beach));
        places.add(new Place(R.string.frances_beach, R.string.frances_beach_summary,
                R.drawable.frances_beach));
        places.add(new Place(R.string.pajucara_beach, R.string.pajucara_beach_summary,
                R.drawable.pajucara_beach));
        places.add(new Place(R.string.ponta_verde_beach, R.string.ponta_verde_beach_summary,
                R.drawable.ponta_verde_beach));
        places.add(new Place(R.string.carro_quebrado_beach, R.string.carro_quebrado_beach_summary,
                R.drawable.carro_quebrado_beach));

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list_place);
        PlaceAdapter adapter = new PlaceAdapter(places);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }

}
