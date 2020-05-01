package com.softrasol.ternaksukses.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ternaksukses.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PopularShopFragment extends Fragment {


    public PopularShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_shop, container, false);
    }

}
