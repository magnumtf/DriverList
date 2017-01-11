package com.buber.driverlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by t1004800 on 8/31/2016.
 */
public class DriverListFragment extends Fragment {

    public static DriverListFragment newInstance() {
        return new DriverListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_driver_list, container, false);
//        mTextView = (TextView) v.findViewById(R.id.snake_belly_text);
//        mImageView = (ImageView) v.findViewById(R.id.snake_belly_image);
//        mImageView.setImageResource(R.drawable.elv_guy1);

        return v;
    }

}
