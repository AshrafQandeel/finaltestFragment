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
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
  View rootView = inflater.inflate(R.layout.fragment_main, container,false);

  //create the main list of data
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(R.string.main_title,R.string.main_paragraph,R.drawable.gaza_main_image2));
        data.add(new Data(R.string.second_main_title,R.string.second_main_paragraph,R.drawable.gaza_main_image));
        DataAdapter adapter = new DataAdapter(getActivity(), data);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
