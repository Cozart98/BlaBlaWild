package com.example.apprenti.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_results_list);

        TextView tv1 = (TextView) findViewById(R.id.textView2);
        TextView tv2 = (TextView) findViewById(R.id.textView3);

        String depart = getIntent().getStringExtra("depart");
        String destination = getIntent().getStringExtra("destination");

       // Intent i = getIntent();
      //  String depart = i.getExtras().getString("depart");
      //  String destination = i.getExtras().getString("destination");



        tv1.setText(depart);
        tv2.setText(destination);

        ListView listeViewResult = (ListView) findViewById(R.id.listViewResult);
        ArrayList<TripResultModel> results = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");

        try {
            results.add(new TripResultModel("Bruce", sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripResultModel("Clark", sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripResultModel("Bary", sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripResultModel("Lex", sdf.parse("21/02/2017-17:00"), 40));
        } catch (ParseException e) {
        }
        TripResultAdapter mResultsAdapter = new TripResultAdapter(this, results);

        ListView mListViewResults;
        listeViewResult.setAdapter((ListAdapter) mResultsAdapter);

    }
}

