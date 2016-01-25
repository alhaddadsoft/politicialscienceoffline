package com.nrsoftbd.healthtips;

import android.opengl.Visibility;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class Web extends Activity {
	private WebView webView1;
	private ProgressBar progressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		
		webView1=(WebView)findViewById(R.id.webView1);
		progressBar=(ProgressBar)findViewById(R.id.progressBar1);
		webView1.loadUrl("www.google.com");
		webView1.getSettings().setJavaScriptEnabled(true);
		webView1.getSettings().setUseWideViewPort(true);
		webView1.getSettings().setBuiltInZoomControls(true);
		webView1.setWebChromeClient(new WebChromeClient(){
			public void OnProgressChanged(WebView view, int newProgress){
				
				super.onProgressChanged(view, newProgress);
				progressBar.setProgress(newProgress);
				
				if (newProgress == 100){
					progressBar.setVisibility(View.GONE);
				}else{
					progressBar.setVisibility(View.VISIBLE);
				}
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web, menu);
		return true;
	}

}
