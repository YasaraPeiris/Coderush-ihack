package com.example.hp.coderush;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountdownActivity extends AppCompatActivity {
    TextView timer;
    Button cancelBtn;
    boolean btnPressed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        timer = (TextView) findViewById(R.id.notificationTime);
        cancelBtn = (Button) findViewById(R.id.cancelAlertBtn);
        btnPressed2 = true;

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                timer.setText("Alert not sent!");


                AlertDialog.Builder builder1 = new AlertDialog.Builder(CountdownActivity.this);
                LayoutInflater inflater = CountdownActivity.this.getLayoutInflater();

                builder1.setMessage("Enter Passcode to Cancel");
                builder1.setCancelable(true);
                builder1.setView(inflater.inflate(R.layout.dialog_confirm, null));
                builder1.setPositiveButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
        MyCount counter = new MyCount(10000, 1000);
        counter.start();
        if(btnPressed2){
            timer.setText("Alert sent");
        }
    }

    public class MyCount extends CountDownTimer {

        public MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            timer.setText("Alert not sent!");
        }

        @Override
        public void onTick(long millisUntilFinished) {
            timer.setText("Alert sending cancelled in " + millisUntilFinished / 1000+" seconds");
            if(btnPressed2){
                timer.setText("Alert sent!");
            }
        }
    }
}
