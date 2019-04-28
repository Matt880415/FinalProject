package com.example.testmine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mon = (Button)findViewById(R.id.monday);

        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, openmonday.class));
            }
        });

        Button tues = (Button)findViewById(R.id.tuesday);

        tues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, opentuesday.class));
            }
        });

        Button wed = (Button)findViewById(R.id.wednesday);

        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, openwednesday.class));
            }
        });

        Button thur = (Button)findViewById(R.id.thursday);

        thur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, openthursday.class));
            }
        });

        Button fri = (Button)findViewById(R.id.friday);

        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, openfriday.class));
            }
        });

        Button sat = (Button)findViewById(R.id.saturday);

        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, opensaturday.class));
            }
        });

        Button sun = (Button)findViewById(R.id.sunday);

        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, opensunday.class));
            }
        });



    }


}
