package com.example.ktemu.timmagram.Utils;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;



import android.util.Log;

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

}

