package com.example.familyrobot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ConnectActivity extends Activity {

	private Button btn_exit;
	private Button btn_wifi;
	private Button btn_bluetooth;
	static Connection connection;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connect);

		APPManage.getInstance().addActivity(this);
		
		final Intent intent = new Intent(this, FunctionActivity.class);
		
		btn_wifi = (Button) findViewById(R.id.btn_wifi);
		btn_bluetooth = (Button) findViewById(R.id.btn_bluetooth);
		btn_exit = (Button) findViewById(R.id.btn_exit);

		btn_wifi.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				connection = Connection.WIFI;
				startActivity(intent);
				//Toast.makeText(getApplicationContext(), "wifi连接成功！", Toast.LENGTH_SHORT).show();
			}
		});

		btn_bluetooth.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				connection = Connection.BLUETOOTH;
				startActivity(intent);
				//Toast.makeText(getApplicationContext(), "蓝牙连接成功！", Toast.LENGTH_SHORT).show();
			}
		});
		
		btn_exit.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				APPManage.getInstance().exit(ConnectActivity.this);
			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

}
