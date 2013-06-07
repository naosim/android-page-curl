package com.mystictreegames.pagecurl;

import android.view.View;
import android.view.ViewGroup;

public interface SimplePagerAdapter {
	public int getCount();
	public View getView(int position, View convertView, ViewGroup parent);
}
