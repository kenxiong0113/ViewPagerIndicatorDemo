package com.example.administrator.viewpagerindicatordemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.example.administrator.qmuiviewpagerdemo.R;

public class MainActivity extends FragmentActivity
{
    private List<Fragment> mTabContents = new ArrayList<Fragment>();
    private FragmentPagerAdapter mAdapter;
    private ViewPager mViewPager;
//    private List<String> mDatas = Arrays.asList("短信1", "短信2", "短信3", "短信4",
//            "短信5", "短信6", "短信7", "短信8", "短信9");
	private List<String> mDatas = Arrays.asList("短信", "收藏");

    private ViewPagerIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initView();
        initDatas();
        //设置Tab上的标题
        mIndicator.setTabItemTitles(mDatas);
        mViewPager.setAdapter(mAdapter);
        //设置关联的ViewPager
        mIndicator.setViewPager(mViewPager,0);

    }

    private void initDatas()
    {
            VpSimpleFragment fragment1 = VpSimpleFragment.newInstance(mDatas.get(0));
            mTabContents.add(fragment1);
            VpSimpleFragment2 fragment2 = VpSimpleFragment2.newInstance(mDatas.get(1));
            mTabContents.add(fragment2);

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager())
        {
            @Override
            public int getCount()
            {
                return mTabContents.size();
            }

            @Override
            public Fragment getItem(int position)
            {
                return mTabContents.get(position);
            }
        };
    }

    private void initView()
    {
        mViewPager = (ViewPager) findViewById(R.id.id_vp);
        mIndicator = (ViewPagerIndicator) findViewById(R.id.id_indicator);
    }


}
