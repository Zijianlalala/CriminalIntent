package com.example.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wuzijian on 2017/7/25.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

