package com.mycompany.myfirstapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gareth.rayner on 05/08/2015.
 */
public class suggFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sugg_frag, container, false);
    }
}
