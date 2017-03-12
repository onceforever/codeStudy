package com.example.familyrobot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	private EditText username;
	private EditText password;
	private Button btn_ok;
	private Button btn_cancel;
	private Intent intent;
	private static final String USERNAME = "liuxuejiao";
	private static final String PASSWORD = "123456";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		APPManage.getInstance().addActivity(this);

		username = (EditText) findViewById(R.id.edit_username);
		password = (EditText) findViewById(R.id.edit_password);
		btn_ok = (Button) findViewById(R.id.button_ok);
		btn_cancel = (Button) findViewById(R.id.button_cancel);

		intent = new Intent(this, ConnectActivity.class);

		btn_ok.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				String str_username = username.getText().toString();
				String str_password = password.getText().toString();

				/*Log.i("tag", "username--->" + str_username);
				Log.i("tag", "password--->" + str_password);
				Log.i("tag", "USERNAME--->" + USERNAME);
				Log.i("tag", "PASSWORD--->" + PASSWORD);*/
				
				if (!str_username.equals("") && !str_password.equals("")) {
					if (str_username.equals(USERNAME)) {
						if (str_password.equals(PASSWORD)) {
							LoginActivity.this.startActivity(intent);
						} else {
							Toast.makeText(getApplicationContext(), "密码错误，请重新输入！", Toast.LENGTH_SHORT).show();
							cleanEdit();
						}
					} else {
						Toast.makeText(getApplicationContext(), "不存在此用户，请重新输入！", Toast.LENGTH_SHORT).show();
						cleanEdit();
					}
				} else {
					Toast.makeText(getApplicationContext(), "请输入用户名和密码！", Toast.LENGTH_SHORT).show();
					cleanEdit();
				}
			}
			
			public void cleanEdit() {
				username.setText("");
				password.setText("");
			}
			
		});

		btn_cancel.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				APPManage.getInstance().exit(LoginActivity.this);
			}
		});

	}

	@Override
	protected void onDestroy() {

		APPManage.getInstance().exit(LoginActivity.this);
		super.onDestroy();
	}

}
