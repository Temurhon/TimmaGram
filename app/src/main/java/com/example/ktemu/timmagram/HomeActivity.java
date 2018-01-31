package com.example.ktemu.timmagram;

import android.nfc.Tag;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ktemu.timmagram.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    //the code below will organise all your logs

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting");
        //this will call the method setUpBottomNavigation view from the utils package folder, which will take all the functions that i have applied to disable certain things i do not want on my bottom icons.
        setUpBottomNavigationView();
    }

    //Bottom navigation setup

    private void setUpBottomNavigationView(){
        //it'll tell me if my code has made it this far without crashing("the tag will show up if that's the case").
        Log.d(TAG, "setUpBottomNavigationView : setting up bottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        //The java class below will be imported from the utils package folder where i have disabled all the extra unnecessary animation and it will be applied for every button on the bottom of the screen.
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);

    }


}
