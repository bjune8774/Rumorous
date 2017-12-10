package com.olivepanda.rumorous;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.olivepanda.rumorous.util.RLog;

/**
 * Created by JeongByungJune on 2017-12-10.
 */

public class HomeActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RLog.d(TAG, "onCreate");
        setContentView(R.layout.activity_home);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.home_search_fragment, new SearchBarFragment());
        fragmentTransaction.commit();
    }
}
