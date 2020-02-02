package com.example.firstexcercise;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ItemList itemList = new ItemList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //first reference the layout of the class u want the menus to affect
        CoordinatorLayout mainview = findViewById(R.id.main_view);
//        

        //in this method, the switch case is used to make each item in the menu bar work independently

        switch (item.getItemId()){
            case R.id.fragmentred:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                    mainview.setBackgroundColor(Color.RED);
                    //main_effect.setBackgroundColor(Color.BLUE);
                }
                return true;

            case R.id.fragmentblue:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                    mainview.setBackgroundColor(Color.BLUE);
                   // main_effect.setBackgroundColor(Color.GREEN);
                }
                return true;

            case R.id.fragmentgreen:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                    mainview.setBackgroundColor(Color.GREEN);
                    //main_effect.setBackgroundColor(Color.WHITE);
                }
                return true;
            case R.id.fragmentwhite:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                    mainview.setBackgroundColor(Color.WHITE);
                    //main_effect.setBackgroundColor(Color.RED);
                }
                return true;

            default: return super.onOptionsItemSelected(item);
        }



    }

    public void purchase (View view){
        TextView display = (TextView) findViewById(R.id.show);
        Spinner listofthings = findViewById(R.id.spinner);
        //call the spinner here to reference the spinner

        String option = String.valueOf(listofthings.getSelectedItem());
        //use the String.valueOf method to get an item

        //display.setText(option);

        //to get each entity that the user selcted lists create a reference to the lists of items created inthe itemlist class

        List<String> selecteditems = itemList.Categories(option);

        //to display the lists of the selcted items, create a string builder that holds each list in the item
        StringBuilder listformat = new StringBuilder();

        //to create the format use a for loop
        for (String items : selecteditems){
            //in the loop, use the append keywork to tell the list how to appear using the stringbuilder reference
            listformat.append(items).append("\n");
        }

        //the code is complete here, now show all information
        display.setText(listformat);
    }
}
