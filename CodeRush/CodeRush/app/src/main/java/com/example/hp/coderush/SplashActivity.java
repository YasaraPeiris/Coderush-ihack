package com.example.hp.coderush;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by MalshaL on 10/8/2016.
 */

public class SplashActivity extends AppCompatActivity {
    boolean isLoggedIn;
    boolean btnTriggered;
    Intent loginIntent;
    Intent countdownIntent;
    Intent homeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        loginIntent = new Intent(this, LoginActivity.class);
        countdownIntent = new Intent(this, CountdownActivity.class);

        //check login status
        isLoggedIn = true;
        btnTriggered = true;
        if(btnTriggered){
            finish();
            startActivity(countdownIntent);
        }
        else if(isLoggedIn){
            finish();
            startActivity(loginIntent);
        }
        else{
            finish();
        }
        finish();
    }
}