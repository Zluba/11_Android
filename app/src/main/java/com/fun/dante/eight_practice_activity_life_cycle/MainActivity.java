package com.fun.dante.eight_practice_activity_life_cycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "life_cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"now in onCreate!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"now in onResume!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"now in onStart!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"now in Restart!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"now in onStop!");
    }
}
