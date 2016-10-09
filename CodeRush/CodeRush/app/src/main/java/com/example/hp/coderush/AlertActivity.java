package com.example.hp.coderush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AlertActivity extends AppCompatActivity {
    TextView nameBox;
    TextView positionbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        nameBox = (TextView) findViewById(R.id.nameAlert);
        positionbox = (TextView) findViewById(R.id.alertLocation);
    }
}
