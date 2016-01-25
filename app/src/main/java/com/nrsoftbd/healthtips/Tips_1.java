package com.nrsoftbd.healthtips;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.widget.ImageView;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Timer;
import java.util.TimerTask;


public class Tips_1 extends Activity {
	private ImageView image1;
	private int[] imageArray;
	private int currentIndex;
	private int startIndex;
	private int endIndex;
	private ViewFlipper flipper;



	/**
	 * ATTENTION: This was auto-generated to implement the App Indexing API.
	 * See https://g.co/AppIndexing/AndroidStudio for more information.
	 */
	private GoogleApiClient client;
	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tips_1);
		Context context1 = getApplicationContext();
		CharSequence text1 = "اضغط مرتين للتكبير";
		int duration1 = Toast.LENGTH_LONG;
		Toast toast = Toast.makeText(context1, text1, duration1);
		toast.show();
		// Create the interstitial.
		//interstitial = new InterstitialAd(this);
		//interstitial.setAdUnitId("ca-app-pub-3940256099942544/1033173712");


	AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest request = new AdRequest.Builder().build();
		//.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)        // All emulators
		//		.addTestDevice("C280DA75EB4F705224D5E8C385BBC6D8")  // An example device ID
		//		.build();
		mAdView.loadAd(request);


		Button btn = (Button) findViewById(R.id.button);
		Button btn2 = (Button) findViewById(R.id.button2);


		image1 = (ImageView) findViewById(R.id.image);
		imageArray = new int[32];
		imageArray[1] = R.drawable.a;
		imageArray[2] = R.drawable.a2;
		imageArray[3] = R.drawable.a3;
		imageArray[4] = R.drawable.a4;
		imageArray[5] = R.drawable.a5;
		imageArray[6] = R.drawable.a6;
		imageArray[7] = R.drawable.a7;
		imageArray[8] = R.drawable.a8;
		imageArray[9] = R.drawable.a9;
		imageArray[10] = R.drawable.b10;
		imageArray[11] = R.drawable.b11;
		imageArray[12] = R.drawable.b12;
		imageArray[13] = R.drawable.b13;
		imageArray[14] = R.drawable.b14;
		imageArray[15] = R.drawable.b15;
		imageArray[16] = R.drawable.b16;
		imageArray[17] = R.drawable.c17;
		imageArray[18] = R.drawable.c18;
		imageArray[19] = R.drawable.c19;
		imageArray[20] = R.drawable.c20;
		imageArray[21] = R.drawable.c21;
		imageArray[22] = R.drawable.c22;
		imageArray[23] = R.drawable.c23;
		imageArray[24] = R.drawable.c24;
		imageArray[25] = R.drawable.c25;
		imageArray[26] = R.drawable.c26;
		imageArray[27] = R.drawable.e27;
		imageArray[28] = R.drawable.e28;
		imageArray[29] = R.drawable.e29;
		imageArray[30] = R.drawable.e30;
		imageArray[31] = R.drawable.e31;

		startIndex = 1;
		endIndex = 32;


		btn.setOnClickListener(new View.OnClickListener() {
								   public void onClick(View view) {
									  image1.setImageResource(imageArray[currentIndex]);
									  if (currentIndex > endIndex) {
										   currentIndex--;
										   Context context1 = getApplicationContext();
										   CharSequence text1 = "End";
										   int duration1 = Toast.LENGTH_SHORT;
										   Toast toast = Toast.makeText(context1, text1, duration1);
										   toast.show();
									   }
										else {
										   currentIndex++;
									   }

								   }
							   }


		);

		btn2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image1.setImageResource(imageArray[currentIndex]);
				if (currentIndex < startIndex) {
					currentIndex++;
					Context context = getApplicationContext();
					CharSequence text = "Start";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}
				else {
					currentIndex--;
				}
			}

		}

		);
		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
	}

	@Override
	public void onStart() {
		super.onStart();

		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client.connect();
		Action viewAction = Action.newAction(
				Action.TYPE_VIEW, // TODO: choose an action type.
				"Tips_1 Page", // TODO: Define a title for the content shown.
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
				"Tips_1 Page", // TODO: Define a title for the content shown.
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







