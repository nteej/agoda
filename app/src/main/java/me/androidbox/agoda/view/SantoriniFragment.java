package me.androidbox.agoda.view;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.androidbox.agoda.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SantoriniFragment extends Fragment {


    public SantoriniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_santorini, container, false);
    }

}
