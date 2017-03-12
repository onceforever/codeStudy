package com.example.familyrobot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends Activity {

	private Thread thread;
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		APPManage.getInstance().addActivity(this);
		setContentView(R.layout.activity_welcome);
		
		intent = new Intent(this, LoginActivity.class);
		thread = new Thread(new MyRunnable());
		thread.start();
	}
	
	class MyRunnable implements Runnable {

		public void run() {
			try {
				Thread.sleep(3000);
				WelcomeActivity.this.startActivity(intent);
				WelcomeActivity.this.finish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
