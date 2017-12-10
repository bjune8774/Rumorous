package com.olivepanda.rumorous;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olivepanda.rumorous.util.RLog;

/**
 * Created by JeongByungJune on 2017-12-10.
 */

public class SearchBarFragment extends Fragment {
    private final String TAG = this.getClass().getName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RLog.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.search_bar_fragment_layout, container, false);
    }
}
