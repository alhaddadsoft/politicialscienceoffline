package com.nrsoftbd.healthtips;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Tips_4 extends Activity {
	private ImageView image4;
	private int[] imageArray4;
	private int currentIndex4;
	private int startIndex4;
	private int endIndex4;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tips_4);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest request = new AdRequest.Builder().build();
		mAdView.loadAd(request);

		Context context1 = getApplicationContext();
		CharSequence text1 = "اضغط مرتين للتكبير";
		int duration1 = Toast.LENGTH_LONG;
		Toast toast = Toast.makeText(context1, text1, duration1);
		toast.show();

		image4 = (ImageView) findViewById(R.id.image);
		imageArray4 = new int[16];
		imageArray4[1] = R.drawable.i1;
		imageArray4[2] = R.drawable.i2;
		imageArray4[3] = R.drawable.i3;
		imageArray4[4] = R.drawable.i4;
		imageArray4[5] = R.drawable.i5;
		imageArray4[6] = R.drawable.i6;
		imageArray4[7] = R.drawable.i7;
		imageArray4[8] = R.drawable.i8;
		imageArray4[9] = R.drawable.i9;
		imageArray4[10] = R.drawable.i10;
		imageArray4[11] = R.drawable.i11;
		imageArray4[12] = R.drawable.i12;
		imageArray4[13] = R.drawable.i13;
		imageArray4[14] = R.drawable.i14;
		imageArray4[15] = R.drawable.i15;

		startIndex4 = 0;
		endIndex4 = 15;

		Button btn7 = (Button) findViewById(R.id.button7);
		Button btn8 = (Button) findViewById(R.id.button8);

		btn7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image4.setImageResource(imageArray4[currentIndex4]);
				currentIndex4++;

				if (currentIndex4 > endIndex4) {
					currentIndex4--;
					Context context = getApplicationContext();

					CharSequence text = "End";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}

			}
		});
		btn8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				image4.setImageResource(imageArray4[currentIndex4]);
				currentIndex4--;
				if (currentIndex4 < startIndex4) {
					currentIndex4++;
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
		getMenuInflater().inflate(R.menu.tips_4, menu);
		return true;
	}

}
