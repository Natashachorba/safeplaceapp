package com.example.vidya.dngrz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button rD = (Button)findViewById(R.id.reportDanger);

        rD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent moveToReport = new Intent(getApplicationContext(), Report.class);
                startActivity(moveToReport);
            }
        });

        Button gH = (Button)findViewById(R.id.getHelp);
/**
 * TODO: Set up get help page
 */
        gH.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent moveToghp = new Intent(getApplicationContext(), gethhelppage.class);
                startActivity(moveToghp);
            }
        });

        Button dZ = (Button)findViewById(R.id.DangerZone);
/**
 * TODO: Set up get find danger zone page
 */
        dZ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent moveTodp = new Intent(getApplicationContext(), dangerpage.class);
                startActivity(moveTodp);
            }
        });
    }

}
