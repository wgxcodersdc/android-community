package com.example.ijeomaeze.nowyouseeme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Initialize Button and Image View variables

    private Button seeMeButton;
    private Button hideMeButton;
    private ImageView star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hook up Java variables to UI components
        seeMeButton = (Button) findViewById(R.id.seeMeButton);
        hideMeButton = (Button) findViewById(R.id.hideMeButton);
        star = (ImageView) findViewById(R.id.star);

        seeMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star.setVisibility(View.VISIBLE);
            }
        });

        hideMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star.setVisibility(View.INVISIBLE);
            }
        });
    }
}
