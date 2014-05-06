package com.hb.annotations;

import android.app.Service;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Filterable;
import android.widget.RatingBar;

public class GenericClasses
{
	
	public <T extends Service, V extends View> T getMyService(V v)
	{
		return null;
	}
	
	public <V extends View> String getData(V v)
	{
		RatingBar ratingBar = (RatingBar) v;
		return ratingBar.toString();
	}
	
	public <T extends BaseAdapter & Filterable> void applyFilterLogic(T arrayAdapterObject)
	{
		
	}
	
	public <T extends BaseAdapter & Filterable & OnClickListener> void applyAnotherLogic(T arrayAdapterObject)
	{
		
	}
}
