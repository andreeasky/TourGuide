package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

    /**
     * {@link Fragment} that displays a list of attractions.
     */
    public class CastlesFragment extends Fragment {


        public CastlesFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

            // Create a list of attractions
            final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
            attractions.add(new Attraction(R.string.bran_castle, R.string.bran_castle_description, R.drawable.bran_castle));
            attractions.add(new Attraction(R.string.corvin_castle, R.string.corvin_castle_description, R.drawable.corvin_castle));
            attractions.add(new Attraction(R.string.fagaras_fortress, R.string.fagaras_fortress_description, R.drawable.fagaras_fortress));
            attractions.add(new Attraction(R.string.peles_castle, R.string.peles_castle_description, R.drawable.peles_castle));
            attractions.add(new Attraction(R.string.rasnov_fortress, R.string.rasnov_fortress_description, R.drawable.rasnov_fortress));
            attractions.add(new Attraction(R.string.viscri_fortified_church, R.viscri_fortified_church_description, R.drawable.viscri_fortified_church));
            attractions.add(new Attraction(R.string.biertan_fortified_church, R.string.biertan_fortified_church_description, R.drawable.biertan_fortified_church));
            attractions.add(new Attraction(R.string.harman_fortified_church, R.string.harman_fortified_church_description, R.drawable.harman_fortified_church));
            attractions.add(new Attraction(R.string.jidvei_bethlen_haller_castle, R.string.jidvei_bethlen_haller_castle_description, R.drawable.jidvei_bethlen_haller_castle));
            attractions.add(new Attraction(R.string.biertan_fortified_church, R.string.biertan_fortified_church_description, R.drawable.biertan_fortified_church));
            attractions.add(new Attraction(R.string.prejmer_fortified_church, R.string.prejmer_fortified_church_description, R.drawable.prejmer_fortified_church));
            attractions.add(new Attraction(R.string.saschiz_fortified_church, R.string.saschiz_fortified_church_description, R.drawable.saschiz_fortified_church));
            attractions.add(new Attraction(R.string.valea_viilor_fortified_church, R.string.valea_viilor_fortified_church_description, R.drawable.valea_viilor_fortified_church));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
            // adapter knows how to create list items for each item in the list.
            PagerAdapter adapter = new PagerAdapter(getActivity(), attractions, R.color.category_castles);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // fragment_attractions_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Attraction} in the list.
            listView.setAdapter(adapter);

            // Get the {@link Attraction} object at the given position the user clicked on
            Attraction attraction = attractions.get(position);

            return rootView;

        }
    }






