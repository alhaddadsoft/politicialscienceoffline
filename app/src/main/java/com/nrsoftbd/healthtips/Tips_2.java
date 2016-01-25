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

public class Tips_2 extends Activity {
	private ImageView image2;
	private int[] imageArray2;
	private int currentIndex2;
	private int startIndex2;
	private int endIndex2;
	private ViewFlipper flipper;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tips_2);
		super.onCreate(savedInstanceState);

		Context context1 = getApplicationContext();
		CharSequence text1 = "اضغط مرتين للتكبير";
		int duration1 = Toast.LENGTH_LONG;
		Toast toast = Toast.makeText(context1, text1, duration1);
		toast.show();

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest request = new AdRequest.Builder().build();
		mAdView.loadAd(request);

		image2 = (ImageView) findViewById(R.id.image);
		imageArray2 = new int[42];
		imageArray2[1] = R.drawable.f;
		imageArray2[2] = R.drawable.f2;
		imageArray2[3] = R.drawable.f3;
		imageArray2[4] = R.drawable.f4;
		imageArray2[5] = R.drawable.f5;
		imageArray2[6] = R.drawable.f6;
		imageArray2[7] = R.drawable.f7;
		imageArray2[8] = R.drawable.f8;
		imageArray2[9] = R.drawable.f9;
		imageArray2[10] = R.drawable.g;
		imageArray2[11] = R.drawable.g1;
		imageArray2[12] = R.drawable.g2;
		imageArray2[13] = R.drawable.g3;
		imageArray2[14] = R.drawable.g4;
		imageArray2[15] = R.drawable.g5;
		imageArray2[16] = R.drawable.g6;
		imageArray2[17] = R.drawable.g7;
		imageArray2[18] = R.drawable.g8;
		imageArray2[19] = R.drawable.g9;
		imageArray2[20] = R.drawable.f10;
		imageArray2[21] = R.drawable.f11;
		imageArray2[22] = R.drawable.f12;
		imageArray2[23] = R.drawable.f13;
		imageArray2[24] = R.drawable.f14;
		imageArray2[25] = R.drawable.f15;
		imageArray2[26] = R.drawable.f16;
		imageArray2[27] = R.drawable.f17;
		imageArray2[28] = R.drawable.f18;
		imageArray2[29] = R.drawable.f19;
		imageArray2[30] = R.drawable.f20;
		imageArray2[31] = R.drawable.f21;
		imageArray2[32] = R.drawable.f22;
		imageArray2[33] = R.drawable.f23;
		imageArray2[34] = R.drawable.f24;
		imageArray2[35] = R.drawable.f25;
		imageArray2[36] = R.drawable.f26;
		imageArray2[37] = R.drawable.f27;
		imageArray2[38] = R.drawable.f28;
		imageArray2[39] = R.drawable.f29;
		imageArray2[40] = R.drawable.f30;
		imageArray2[41] = R.drawable.f31;

		startIndex2 = 0;
		endIndex2 = 41;

		flipper = (ViewFlipper) findViewById(R.id.viewFlipper2);

		Button btn3 = (Button) findViewById(R.id.button3);
		Button btn4 = (Button) findViewById(R.id.button4);
		btn3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image2.setImageResource(imageArray2[currentIndex2]);
				currentIndex2++;

				if (currentIndex2 > endIndex2) {
					currentIndex2--;
					Context context = getApplicationContext();

					CharSequence text = "End";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}

			}
		});
		btn4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image2.setImageResource(imageArray2[currentIndex2]);
				currentIndex2--;
				if (currentIndex2 < startIndex2) {
					currentIndex2++;
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
		getMenuInflater().inflate(R.menu.tips_2, menu);
		return true;
	}

}
