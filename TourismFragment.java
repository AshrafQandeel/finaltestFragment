package com.example.ashraf.finaltestfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourismFragment extends Fragment {


    public TourismFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container,false);

        //create the main list of data
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(R.string.tourism_title_mosque,R.string.tourism_paragraph_mosque,R.drawable.great_mosque));
        data.add(new Data(R.string.tourism_title_church,R.string.tourism_paragraph_church,R.drawable.church));
        data.add(new Data(R.string.tourism_title_basha,R.string.tourism_paragraph_basha,R.drawable.qaser_basha));

        DataAdapter adapter = new DataAdapter(getActivity(), data);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
