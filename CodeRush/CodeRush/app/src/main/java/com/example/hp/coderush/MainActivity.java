package com.example.hp.coderush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Intent loginIntent;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okBtn = (Button)findViewById(R.id.okBtn);
        loginIntent = new Intent(this, LoginActivity.class);
        okBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(loginIntent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
