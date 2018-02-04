package com.example.ktemu.timmagram.Utils;

import com.example.ktemu.timmagram.HomeActivity;
import com.example.ktemu.timmagram.LikesActivity;
import com.example.ktemu.timmagram.ProfileActivity;
import com.example.ktemu.timmagram.R;
import com.example.ktemu.timmagram.SearchActivity;
import com.example.ktemu.timmagram.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

//Created by ktemu on 31/01/2018.

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void  setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        //these functions can be found in this website: https://github.com/ittianyu/BottomNavigationViewEx
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }


    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);//0
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);//1
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);//2
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikesActivity.class);//3
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class);//4
                        context.startActivity(intent5);
                        break;


                }


                return false;
            }
        });
    }

}

