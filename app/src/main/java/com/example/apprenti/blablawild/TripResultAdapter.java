package com.example.apprenti.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by apprenti on 13/09/17.
 */


public class TripResultAdapter extends BaseAdapter {
    private Context context; //context
    private ArrayList<TripResultModel> items; //data source of the list adapter

    //public constructor
    public TripResultAdapter(Context context, ArrayList<TripResultModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return items.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.trip_item, parent, false);
        }

        // get current item to be displayed
        TripResultModel currentItem = (TripResultModel) getItem(position);

        // get the TextView for item name and item description
        TextView textViewItemPrnConducteur = (TextView)
                convertView.findViewById(R.id.prnConducteur);
        TextView textViewItemDateHeure = (TextView)
                convertView.findViewById(R.id.dateHeure);
        TextView textViewItemPrix = (TextView)
                convertView.findViewById(R.id.prix);

        //sets the text for item name and item description from the current item object
        textViewItemPrnConducteur.setText(currentItem.getPrénom());
        textViewItemDateHeure.setText(currentItem.getDepart().toString());
        textViewItemPrix.setText(String.valueOf(currentItem.getPrix()));

        // returns the view for the current row
        return convertView;
    }
}



