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
public class ChurchFragment extends Fragment {


    public ChurchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.catedral_church, R.string.catedral_church_summary,
                R.drawable.catedral_church));
        places.add(new Place(R.string.senhora_do_o_church, R.string.senhora_do_o_church_summary,
                R.drawable.senhora_do_o_church));
        places.add(new Place(R.string.martirios_church, R.string.martirios_church_summary,
                R.drawable.martirios_church));
        places.add(new Place(R.string.rosario_church, R.string.rosario_church_summary,
                R.drawable.rosario_church));


        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list_place);
        PlaceAdapter adapter = new PlaceAdapter(places);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }

}
