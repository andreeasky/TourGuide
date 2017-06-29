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
    public class MountainsFragment extends Fragment {


        public MountainsFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

            // Create a list of attractions
            final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
            attractions.add(new Attraction(R.string.apuseni_nature_park, R.string.apuseni_nature_park_description, R.drawable.apuseni_nature_park));
            attractions.add(new Attraction(R.string.bicazului_gorges, R.string.bicazului_gorges_description, R.drawable.bicazului_gorges));
            attractions.add(new Attraction(R.string.calimani_national_park, R.string.calimani_national_park_description, R.drawable.calimani_mountains));
            attractions.add(new Attraction(R.string.ceahlau_national_park, R.string.ceahlau_national_park_description, R.drawable.ceahlau_national_park));
            attractions.add(new Attraction(R.string.piatra_craiului, R.string.piatra_craiului_description, R.drawable.piatra_craiului_national_park));
            attractions.add(new Attraction(R.string.retezat_national_park, R.string.retezat_national_park_description, R.drawable.retezat_national_park));
            attractions.add(new Attraction(R.string.transfagarasan, R.string.transfagarasan_description, R.drawable.transfagarasan));
            attractions.add(new Attraction(R.string.transalpina, R.string.transalpina_description, R.drawable.transalpina));
            attractions.add(new Attraction(R.string.transbucegi, R.string.transbucegi_description, R.drawable.transbucegi));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
            // adapter knows how to create list items for each item in the list.
            AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_mountains);

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


