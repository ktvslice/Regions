package com.example.kieran.regions;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class GameScreen extends Activity {

    boolean p1Turn;
    boolean alreadySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        p1Turn = true;
    }

    public void select (View view){
        Button selectedButton = (Button) findViewById(view.getId());
        if(selectedButton.getText().equals("")){
            if(p1Turn){
                selectedButton.setText("1");
                selectedButton.setBackgroundColor(Color.RED);
                p1Turn = false;
            }
            else{
                selectedButton.setText("2");
                selectedButton.setBackgroundColor(Color.BLUE);
                p1Turn = true;
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
