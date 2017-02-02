package com.introtoandroid.myfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MyFirstAndroidActivity extends AppCompatActivity {

    private static final String DEBUG_TAG= "MyFirstAppLogging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_android);
//        forceError();

        Log.i(DEBUG_TAG, "In the onCreate() method of the MyFirstAndroidAppActivity Class");


    }

    public void forceError() {
        if (true) {
            throw new Error("ERROR");
        }
    }
}
