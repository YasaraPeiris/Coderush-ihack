package com.example.hp.coderush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button myDetailsBtn;
    Button contactsBtn;
    Button reportActivityBtn;
    Button settingsBtn;
    Intent settingsIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myDetailsBtn = (Button) findViewById(R.id.myDetailsBtn);
        contactsBtn = (Button) findViewById(R.id.addContactBtn);
        reportActivityBtn = (Button) findViewById(R.id.reportActivityBtn);
        settingsBtn = (Button) findViewById(R.id.settingsBtn);

        settingsIntent = new Intent(this, SettingsActivity.class);
        myDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(settingsIntent);
            }
        });
    }
}
