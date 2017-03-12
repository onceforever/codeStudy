package com.example.familyrobot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FunctionActivity extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_function);
		
		switch (ConnectActivity.connection) {
		case BLUETOOTH:
			Toast.makeText(this, "当前为蓝牙连接！", Toast.LENGTH_SHORT).show();
			break;
		case WIFI:
			Toast.makeText(this, "当前为WIFI连接！", Toast.LENGTH_SHORT).show();
			break;
		}
		/*if (ConnectActivity.connection == Connection.BLUETOOTH) {
			Toast.makeText(this, "当前为蓝牙连接！", Toast.LENGTH_SHORT).show();
		} else if (ConnectActivity.connection == Connection.WIFI) {
			Toast.makeText(this, "当前为WIFI连接！", Toast.LENGTH_SHORT).show();
		}*/
	}

	
}
