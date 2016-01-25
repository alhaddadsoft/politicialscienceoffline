package com.nrsoftbd.healthtips;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tips_5 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tips_5);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tips_5, menu);
		return true;
	}

}
