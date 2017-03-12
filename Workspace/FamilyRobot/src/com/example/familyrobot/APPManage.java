package com.example.familyrobot;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

public class APPManage extends Application {

	private List<Activity> activityList = new LinkedList<Activity>();
	private static APPManage instance;

	public APPManage() {

	}

	public synchronized static APPManage getInstance() {
		if (null == instance) {
			instance = new APPManage();
		}
		return instance;
	}

	public void addActivity(Activity activity) {
		activityList.add(activity);
	}

	public void exit(Context context) {
		for (Activity activity : activityList) {
			if (activity != null) {
				activity.finish();
			}
		}
		ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
		activityManager.killBackgroundProcesses("com.example.familyrobot");
		System.exit(0);
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
		System.gc();
	}

}
