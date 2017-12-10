package com.olivepanda.rumorous;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.olivepanda.rumorous.util.RLog;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = this.getClass().getName();

    private static final int RM_WELCOME_MAX_PAGES = 3;

    private ViewPager mViewPager;

    private TextView mSkipText;
    private TextView mStartText;

    private List<ImageView> mPageDotList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // TODO : Add Dynamically
        mPageDotList = new ArrayList<ImageView>();
        mPageDotList.add((ImageView)findViewById(R.id.welcome_page_dot_1));
        mPageDotList.add((ImageView)findViewById(R.id.welcome_page_dot_2));
        mPageDotList.add((ImageView)findViewById(R.id.welcome_page_dot_3));
        mPageDotList.get(1).setAlpha((float)0.5);
        mPageDotList.get(2).setAlpha((float)0.5);

        mViewPager = (ViewPager)findViewById(R.id.welcome_view_pager);
        mViewPager.setAdapter(new WelcomeSectionAdapter(getSupportFragmentManager()));
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            private int mPrevPosition = 0;

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //RLog.d(TAG, "onPageScrolled : position = " + position);
            }

            @Override
            public void onPageSelected(int position) {
                RLog.d(TAG, "onPageSelected : position = " + position);
                mPageDotList.get(mPrevPosition).setAlpha((float)0.5);
                mPageDotList.get(position).setAlpha((float)1);
                mPrevPosition = position;

                if(position == RM_WELCOME_MAX_PAGES - 1) {
                    mStartText.setVisibility(View.VISIBLE);
                } else {
                    mStartText.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //RLog.d(TAG, "onPageScrollStateChanged : state = " + state);
            }
        });

        mSkipText = (TextView)findViewById(R.id.welcome_skip_text);
        mStartText = (TextView)findViewById(R.id.welcome_start_text);

        mSkipText.setOnClickListener(this);
        mStartText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(WelcomeActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    class WelcomeSectionAdapter extends FragmentPagerAdapter {

        public WelcomeSectionAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            RLog.d(TAG, "getItem = " + position);
            return new WelcomeFragment(position);
        }

        @Override
        public int getCount() {
            return RM_WELCOME_MAX_PAGES;
        }
    }}
