package com.example.apprenti.blablawild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class SearchItineraryActivity extends AppCompatActivity {
    Button button;
    EditText editTextDepart, editTextDestination;


    public void init() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cl = new Intent(SearchItineraryActivity.this, ViewSearchItineraryResultsListActivity.class);
                startActivity(cl);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_itinerary);
        button = (Button) findViewById(R.id.button);
        editTextDepart = (EditText) findViewById(R.id.editText);
        editTextDestination = (EditText) findViewById(R.id.editText2);
        init();

        editTextDepart.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String depart = editTextDepart.getText().toString();
                String destination = editTextDestination.getText().toString();
                if ((depart.contentEquals("")) || (destination.contentEquals(""))) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.texteString2), Toast.LENGTH_LONG).show();
                }
                else
                {
                    button.setEnabled(true);
                }

            }
        });
        editTextDestination.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String depart = editTextDepart.getText().toString();
                String destination = editTextDestination.getText().toString();
                if ((depart.contentEquals("")) || (destination.contentEquals(""))) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.texteString2), Toast.LENGTH_LONG).show();
                }
                else
                {
                    button.setEnabled(true);

                }

            }
        });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String depart = editTextDepart.getText().toString();
                    String destination = editTextDestination.getText().toString();


                    Intent intent = new Intent(SearchItineraryActivity.this,
                            ViewSearchItineraryResultsListActivity.class);
                    intent.putExtra("depart", depart);
                    intent.putExtra("destination", destination);
                    startActivity(intent);


                }
            });


    }

}
