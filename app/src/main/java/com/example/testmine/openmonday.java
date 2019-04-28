package com.example.testmine;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class openmonday extends AppCompatActivity{

    ImageButton ibtn = (ImageButton) findViewById(R.id.returnb);
    ListView listView = (ListView) findViewById(R.id.tlist);

    String[] timearray = {"1 a.m.", "2 a.m.", "3 a.m.", "4 a.m.", "5 a.m.", "6 a.m.", "7 a.m.", "8 a.m.", "9 a.m.",
            "10 a.m.", "11 a.m.", "12 p.m.", "1 p.m.", "2 p.m.", "3p.m.", "4 p.m.", "5 p.m.", "6 p.m.", "7 p.m.", "8 p.m.",
            "9 p.m.", "10 p.m.", "11 p.m.", "12 a.m."};

    String[] eventarray = new String[24];

    EditText[] editarray;

    TextView textview;
    AlertDialog alert;
    EditText edittext;
    TextView test;

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday);

        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(openmonday.this, MainActivity.class));
            }
        });

        /**listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String item = (String) parent.getItemAtPosition(int position);
                item += "YourText";
                ArrayAdapter adapter = (ArrayAdapter) parent.getAdapter();
                adapter.insert(item, position);
            }*/

        listadapter alist = new listadapter(this, timearray, eventarray);
        listview = (ListView) findViewById(R.id.tlist);
        listview.setAdapter(alist);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                alert.show();

            }
        });

        textview = findViewById(R.id.editview);
        alert = new AlertDialog.Builder(this).create();
        edittext = new EditText(this);

        alert.setTitle("your event");
        alert.setView(edittext);

        alert.setButton(DialogInterface.BUTTON_POSITIVE, "save event",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textview.setText(edittext.getText());
                    }
        });

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(textview.getText());
                alert.show();

            }
        });

    }
}

