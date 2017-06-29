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
    public class MonasteriesFragment extends Fragment {


        public MonasteriesFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

            // Create a list of attractions
            final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
            attractions.add(new Attraction(R.string.arbore_monastery, R.string.arbore_monastery_description, R.drawable.arbore_monastery));
            attractions.add(new Attraction(R.string.humor_monastery, R.string.humor_monastery_description, R.drawable.humor_monastery));
            attractions.add(new Attraction(R.string.moldovita_monastery, R.string.moldovita_monastery_description, R.drawable.moldovita_monastery));
            attractions.add(new Attraction(R.string.probota_monastery, R.string.probota_monastery_description, R.drawable.probota_monastery));
            attractions.add(new Attraction(R.string.sucevita_monastery, R.string.sucevita_monastery_description, R.drawable.sucevita_monastery));
            attractions.add(new Attraction(R.string.voronet_monastery, R.string.voronet_monastery_description, R.drawable.voronet));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
            // adapter knows how to create list items for each item in the list.
            AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_monasteries);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // fragment_attractions_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Attraction} in the list.
            listView.setAdapter(adapter);

            return rootView;

        }
    }




