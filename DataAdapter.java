package com.example.ashraf.finaltestfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {
    public DataAdapter(Context context, ArrayList<Data> data) {
        super(context, 0, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View listItemView = convertView;
       if(listItemView==null){
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
       Data currentData = getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.titleTextView);
        titleTextView.setText(currentData.getTitleId());
        TextView detailsTextView = listItemView.findViewById(R.id.detailsTextView);
        detailsTextView.setText(currentData.getParagraphId());
        ImageView imageView = listItemView.findViewById(R.id.imageView);
        if(currentData.hasImage()) {
            imageView.setImageResource(currentData.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
