package com.olivepanda.rumorous;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.olivepanda.rumorous.util.RLog;

public class WelcomeActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getName();

    private static final int RM_WELCOME_MAX_PAGES = 3;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mViewPager = (ViewPager)findViewById(R.id.welcome_view_pager);
        mViewPager.setAdapter(new WelcomeSectionAdapter(getSupportFragmentManager()));
    }

    class WelcomeSectionAdapter extends FragmentStatePagerAdapter {

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
    }
}
