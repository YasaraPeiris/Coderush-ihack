package com.example.hp.coderush;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.Places;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "PlacesAPIActivity";
   // private GoogleApiClient mGoogleApiClient;
  //  private static final int PERMISSION_REQUEST_CODE = 100;
    int PLACE_AUTOCOMPLETE_REQUEST_CODE = 1;

    boolean isLoggedIn;
    boolean btnTriggered;
    Intent loginIntent;
    Intent countdownIntent;
    Intent homeIntent;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginIntent = new Intent(this, LoginActivity.class);
        countdownIntent = new Intent(this, CountdownActivity.class);
        homeIntent = new Intent(this, HomeActivity.class);

       /* mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .addApi(AppIndex.API).build();*/

        //check login status
        isLoggedIn = true;
        btnTriggered = true;
        if (btnTriggered) {
            finish();
            startActivity(countdownIntent);
            /*if (mGoogleApiClient.isConnected()) {
                   // callPlaceDetectionApi();
            }*/


        } else if (!isLoggedIn) {
            finish();
            startActivity(loginIntent);
        } else {
            finish();
            startActivity(homeIntent);
        }
        finish();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

   /* private void callPlaceDetectionApi() throws SecurityException {
        PendingResult<PlaceLikelihoodBuffer> result = Places.PlaceDetectionApi
                .getCurrentPlace(mGoogleApiClient, null);
        result.setResultCallback(new ResultCallback<PlaceLikelihoodBuffer>() {
            @Override
            public void onResult(@NonNull PlaceLikelihoodBuffer likelyPlaces) {
                final CharSequence thirdPartyAttributions =
                        likelyPlaces.getAttributions();
                //Log.i(LOG_TAG, "loog" + likelyPlaces + likelyPlaces.getStatus().getStatusMessage());
                if (likelyPlaces.getStatus().isSuccess()) {
                    String placeId = likelyPlaces.get(0).getPlace().getId();
                    countdownIntent.putExtra("placeId", placeId);
                    //Log.i(LOG_TAG, "id " + placeId);
                    //Log.i(LOG_TAG, "name "+likelyPlaces.get(0).getPlace().getName());
                    //Log.i(LOG_TAG,"address "+likelyPlaces.get(0).getPlace().getAddress());
                    //Log.i(LOG_TAG, "type "+likelyPlaces.get(0).getPlace().getPlaceTypes());
                    likelyPlaces.release();
                    startActivity(countdownIntent);
                }
            }
        });
    }
*/
    /*@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    *//**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     *//*
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mGoogleApiClient.connect();
        AppIndex.AppIndexApi.start(mGoogleApiClient, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(mGoogleApiClient, getIndexApiAction());
        mGoogleApiClient.disconnect();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }*/
}
