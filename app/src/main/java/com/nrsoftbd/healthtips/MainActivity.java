package com.nrsoftbd.healthtips;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends Activity {
    Button tips1, tips2, tips3, tips4, tips5;
    private InterstitialAd interstitial;
    private Timer myTimer;
    private Boolean exit = false;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the interstitial.
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
// Begin listening to interstitial & show ads.
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                interstitial.show();
            }
        });


        // TODO make intersitial here always instead of all views
        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                TimerMethod();
            }
        }, 0, 420000);


        //new CountDownTimer(1000, 100) {

        //	public void onTick(long millisUntilFinished) {

        //	}

        //	public void onFinish() {

        //	}

        //}.start();


        tips1 = (Button) findViewById(R.id.tips1);
        tips1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Tips_1.class);
                startActivity(i);
                // Create ad request.
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        tips2 = (Button) findViewById(R.id.tips2);
        tips2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Tips_2.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);

                // Begin listening to interstitial & show ads.

                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        tips3 = (Button) findViewById(R.id.tips3);
        tips3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Tips_3.class);
                startActivity(i);

                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);

                // Begin listening to interstitial & show ads.

                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        tips4 = (Button) findViewById(R.id.tips4);
        tips4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Tips_4.class);
                startActivity(i);

                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);

                // Begin listening to interstitial & show ads.

                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });
        tips5 = (Button) findViewById(R.id.tips5);
        tips5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Tips_5.class);
                startActivity(i);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }

    private void TimerMethod() {
        //This method is called directly by the timer
        //and runs in the same thread as the timer.

        //We call the method that will work with the UI
        //through the runOnUiThread method.
        this.runOnUiThread(Timer_Tick);
    }

    private Runnable Timer_Tick = new Runnable() {
        public void run() {

            //This method runs in the same thread as the UI.

            //Do something to the UI thread here
            AdRequest adRequest = new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener() {
                public void onAdLoaded() {
                    interstitial.show();
                }
            });

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "اضغط مرة أخرى للخروج",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.nrsoftbd.healthtips/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.nrsoftbd.healthtips/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
