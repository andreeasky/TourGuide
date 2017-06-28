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
public class VillagesFragment extends Fragment {

    public VillagesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.transylvania, R.string.transylvania_description_description, R.drawable.traditional_village_jina));
        attractions.add(new Attraction(R.string.apuseni_mountains_villages, R.string.apuseni_mountains_villages_description, R.drawable.casa_de_piatra_village_apuseni_mountains));
        attractions.add(new Attraction(R.string.bucovina, R.string.bucovina_description, R.drawable.marginea_village_apuseni_mountains));
        attractions.add(new Attraction(R.string.maramures, R.string.maramures_description, R.drawable.merry_cemetery_sapanta));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        PagerAdapter adapter = new PagerAdapter(getActivity(), attractions, R.color.category_villages);

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
}
