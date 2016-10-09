package com.example.hp.coderush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    boolean isLoggedIn;
    boolean btnTriggered;
    Intent loginIntent;
    Intent countdownIntent;
    Intent homeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
