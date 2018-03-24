package com.example.administrator.viewpagerindicatordemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.qmuiviewpagerdemo.R;

public class VpSimpleFragment2 extends Fragment
{
	public static final String BUNDLE_TITLE = "title";
	private String mTitle = "DefaultValue";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{

		View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_2,null);

		return view;
	}

	public static VpSimpleFragment2 newInstance(String title)
	{
		Bundle bundle = new Bundle();
		bundle.putString(BUNDLE_TITLE, title);
		VpSimpleFragment2 fragment = new VpSimpleFragment2();
		fragment.setArguments(bundle);
		return fragment;
	}
}
