package com.nrsoftbd.healthtips;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Tips_3 extends Activity {
	private ImageView image3;
	private int[] imageArray3;
	private int currentIndex3;
	private int startIndex3;
	private int endIndex3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tips_3);

		Context context1 = getApplicationContext();
		CharSequence text1 = "اضغط مرتين للتكبير";
		int duration1 = Toast.LENGTH_LONG;
		Toast toast = Toast.makeText(context1, text1, duration1);
		toast.show();

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest request = new AdRequest.Builder().build();
		mAdView.loadAd(request);

		image3 = (ImageView) findViewById(R.id.image);
		imageArray3 = new int[28];
		imageArray3[1] = R.drawable.h1;
		imageArray3[2] = R.drawable.h2;
		imageArray3[3] = R.drawable.h3;
		imageArray3[4] = R.drawable.h4;
		imageArray3[5] = R.drawable.h5;
		imageArray3[6] = R.drawable.h6;
		imageArray3[7] = R.drawable.h7;
		imageArray3[8] = R.drawable.h8;
		imageArray3[9] = R.drawable.h9;
		imageArray3[10] = R.drawable.h10;
		imageArray3[11] = R.drawable.h11;
		imageArray3[12] = R.drawable.h12;
		imageArray3[13] = R.drawable.h13;
		imageArray3[14] = R.drawable.h14;
		imageArray3[15] = R.drawable.h15;
		imageArray3[16] = R.drawable.h16;
		imageArray3[17] = R.drawable.h17;
		imageArray3[18] = R.drawable.h18;
		imageArray3[19] = R.drawable.h19;
		imageArray3[20] = R.drawable.h20;
		imageArray3[21] = R.drawable.h21;
		imageArray3[22] = R.drawable.h22;
		imageArray3[23] = R.drawable.h23;
		imageArray3[24] = R.drawable.h24;
		imageArray3[25] = R.drawable.h25;
		imageArray3[26] = R.drawable.h26;
		imageArray3[27] = R.drawable.h27;

		startIndex3 = 0;
		endIndex3 = 27;

         Button btn5 = (Button) findViewById(R.id.button5);
         Button btn6 = (Button) findViewById(R.id.button6);
		btn5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image3.setImageResource(imageArray3[currentIndex3]);
				currentIndex3++;

				if (currentIndex3 > endIndex3) {
					currentIndex3--;
					Context context = getApplicationContext();

					CharSequence text = "End";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}

			}
		});
		btn6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image3.setImageResource(imageArray3[currentIndex3]);
				currentIndex3--;
				if (currentIndex3 < startIndex3) {
					currentIndex3++;
					Context context = getApplicationContext();

					CharSequence text = "Start";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tips_3, menu);
		return true;
	}

}
