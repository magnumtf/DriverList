package com.buber.driverlist;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DriverListActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return DriverListFragment.newInstance();
    }

}
