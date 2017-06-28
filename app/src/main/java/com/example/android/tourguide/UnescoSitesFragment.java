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
    public class UnescoSitesFragment extends Fragment {


        public UnescoSitesFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

            // Create a list of attractions
            final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
            attractions.add(new Attraction(R.string.horezu_monastery, R.string.horezu_monastery_description, R.drawable.horezu_monastery));
            attractions.add(new Attraction(R.string.medieval_fortified_churches_of_transylvania, R.string.medieval_fortified_churches_of_transylvania_description, R.drawable.calnic_fortress));
            attractions.add(new Attraction(R.string.historic_centre_of_sighisoara, R.string.historic_centre_of_sighisoara_description, R.drawable.unesco_world_heritage_site_sighisoara));
            attractions.add(new Attraction(R.string.painted_monasteries_of_bucovina, R.string.painted_monasteries_of_bucovina_description, R.drawable.voronet_painted_monastery_of_bucovina));
            attractions.add(new Attraction(R.string.wooden_churches_of_maramures, R.string.wooden_churches_of_maramures_description, R.drawable.maramures_wooden_churches));
            attractions.add(new Attraction(R.string.dacian_fortress, R.string.dacian_fortress_description, R.drawable.sarmizegetusa_regia_dacian_fortress));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
            // adapter knows how to create list items for each item in the list.
            PagerAdapter adapter = new PagerAdapter(getActivity(), attractions, R.color.category_unesco_sites);

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
