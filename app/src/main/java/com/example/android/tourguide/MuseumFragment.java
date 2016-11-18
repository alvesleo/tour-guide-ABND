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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.imagem_e_som_museum, R.string.imagem_e_som_museum_summary,
                R.drawable.imagem_e_som_museum));
        places.add(new Place(R.string.ist_historico_museum, R.string.ist_historico_museum_summary,
                R.drawable.ist_historico_museum));
        places.add(new Place(R.string.theo_museum, R.string.theo_museum_summary,
                R.drawable.theo_museum));
        places.add(new Place(R.string.floriano_museum_summary, R.string.floriano_museum_summary,
                R.drawable.floriano_museum));
        places.add(new Place(R.string.arte_museum, R.string.arte_museum_summary,
                R.drawable.arte_museum));

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list_place);
        PlaceAdapter adapter = new PlaceAdapter(places);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }

}
