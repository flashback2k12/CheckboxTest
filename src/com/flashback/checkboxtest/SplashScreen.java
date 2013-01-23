package com.flashback.checkboxtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class SplashScreen extends Activity {

	private long ms = 0;
	private long splashTime = 2000;
	private boolean splashActive = true;
	private boolean paused = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		 //Hides the titlebar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
         //start activity
        setContentView(R.layout.splashscreen);

        Thread mythread = new Thread() {
            public void run() {
                try {
                    while (splashActive && ms < splashTime) {
                        if(!paused)
                            ms=ms+100;
                        sleep(100);
                    }
                } catch(Exception e) {}
                finally {
                    Intent intent = new Intent(SplashScreen.this, StartActivity.class);
                    startActivity(intent);
                }
            }
        };
        mythread.start();
	}
}
