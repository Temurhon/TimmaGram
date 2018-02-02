package com.example.ktemu.timmagram;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ktemu.timmagram.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by ktemu on 02/02/2018.
 */

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Started");
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
