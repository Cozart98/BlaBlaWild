package com.example.apprenti.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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

    }
}

