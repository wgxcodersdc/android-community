package com.ieze.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Button ourButton;
    private TextView ourMessage;
    private int numTimesClicked = 0; //counter for amount of buttonclicks


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ourButton = (Button) findViewById(R.id.button); //Cast to button view
        ourMessage = (TextView) findViewById(R.id.textView); // Cast to textView

        // Add clickListner to perform button action, which will wait for an event to do something
        View.OnClickListener ourOnClickListener = new View.OnClickListener() { //creates OnClick Listner object
            @Override
            public void onClick(View v) {
                numTimesClicked = numTimesClicked + 1;
                String result = "The button got tapped " + numTimesClicked + " time";
                if(numTimesClicked != 1) {
                    result += "s.";
                }
                    ourMessage.setText(result);
            }

        };

        ourButton.setOnClickListener(ourOnClickListener);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toastMessage = Toast.makeText(this, "Text value is now " + ourMessage.getText(), Toast.LENGTH_LONG);
            toastMessage.show();
            numTimesClicked = 0;
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
