package com.example.hp.coderush;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLng;

import org.w3c.dom.Text;

public class CountdownActivity extends AppCompatActivity {
    TextView timer;
    Button cancelBtn;
    TextView nameView;
    TextView addressView;
    boolean btnPressed2;
    String placeId;
    LatLng currentLatlng;
  //  private GoogleApiClient mGoogleApiClient;
   // private static final int PERMISSION_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        timer = (TextView) findViewById(R.id.notificationTime);
        cancelBtn = (Button) findViewById(R.id.cancelAlertBtn);
        nameView = (TextView) findViewById(R.id.locationName);
        addressView = (TextView) findViewById(R.id.locationAddress);
        btnPressed2 = true;
        //placeId = getIntent().getExtras().getString("placeId");

       /* mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .addApi(AppIndex.API).build();*/

        nameView.setText("New Arts Theater");
        addressView.setText("Colombo 07000, Sri Lanaka");

        /*Places.GeoDataApi.getPlaceById(mGoogleApiClient, placeId)
                .setResultCallback(new ResultCallback<PlaceBuffer>() {
                    @Override
                    public void onResult(@NonNull PlaceBuffer places) {
                        //Log.i(LOG_TAG, "rrrrrrrr " + places);
                        if (places.getStatus().isSuccess() && places.getCount() > 0) {
                            final Place currentPlace = places.get(0);
                            currentLatlng = currentPlace.getLatLng();
                            String n = currentPlace.getName().toString();
                            nameView.setText(n);
                            if(getCallingActivity()!=null) {
                                if (getCallingActivity().getClassName().equals(MainActivity.class.getName())) {
                                    *//*getActionBar().setTitle(R.string.title_activity_current_loc);
                                    getSupportActionBar().setTitle(R.string.title_activity_current_loc);*//*
                                }
                                else{
                                    *//*getActionBar().setTitle(n);*//*
                                   // getSupportActionBar().setTitle(n);
                                }
                            }
                            addressView.setText(currentPlace.getAddress());

                        } else {

                        }
                        places.release();
                    }
                });*/

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                timer.setText("Alert not sent!");


                /*AlertDialog.Builder builder1 = new AlertDialog.Builder(CountdownActivity.this);
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
                alert11.show();*/
            }
        });
        MyCount counter = new MyCount(20000, 1000);
        counter.start();
        if(btnPressed2){
            timer.setText("Alert sent");
        }
    }

    /*@Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }*/

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
