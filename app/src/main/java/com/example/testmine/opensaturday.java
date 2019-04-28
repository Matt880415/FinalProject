package com.example.testmine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class opensaturday extends AppCompatActivity{

    ImageButton ibtn = (ImageButton) findViewById(R.id.returnb);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday);

        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(opensaturday.this, MainActivity.class));
            }
        });
    }
}