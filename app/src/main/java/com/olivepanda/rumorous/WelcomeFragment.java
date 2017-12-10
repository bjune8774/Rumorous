package com.olivepanda.rumorous;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.olivepanda.rumorous.R;
import com.olivepanda.rumorous.util.RLog;

/**
 * Created by JeongByungJune on 2017-12-09.
 */

public class WelcomeFragment extends Fragment {
    private final String TAG = this.getClass().getSimpleName();
    private int mIndex;

    public WelcomeFragment() {
        super();
    }

    public WelcomeFragment(int idx) {
        RLog.d(TAG, "WelcomeFragment : index = " + idx);
        mIndex = idx;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RLog.d(TAG, "onCreateView : index = " + mIndex);
        View rootView = inflater.inflate(R.layout.welcome_fragment_layout, container, false);
        TextView mainText = (TextView) rootView.findViewById(R.id.welcome_main_text);
        switch(mIndex) {
            case 0 : mainText.setText(R.string.welcome_main_text_1); break;
            case 1 : mainText.setText(R.string.welcome_main_text_2); break;
            case 2 : mainText.setText(R.string.welcome_main_text_3); break;
        }

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        RLog.d(TAG, "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        RLog.d(TAG, "onResume");
        super.onResume();
    }
}
