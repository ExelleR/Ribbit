package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "pzUUacGOoOO7UhkEcQHh7eVkEmtvh129YPgiXo6w", "kN7dPLcY8OkE4xdkut9k4kXwDnv10Oz0FG7OVwRd");
	}
}
