package com.example.ktemu.timmagram;

import android.content.Context;
import android.nfc.Tag;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ktemu.timmagram.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    //the code below will organise all your logs

    private static final String TAG = "HomeActivity";
    private static final int ACTIVITY_NUM = 0;
    private Context mContext = HomeActivity.this;

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
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);


    }


}
