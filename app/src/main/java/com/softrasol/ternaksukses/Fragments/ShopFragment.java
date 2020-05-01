package com.softrasol.ternaksukses.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.softrasol.ternaksukses.Adapters.TabsAccessorAdapter;
import com.softrasol.ternaksukses.ProfileActivity;
import com.softrasol.ternaksukses.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }

    private View mView;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ImageView mProfileImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_shop, container, false);
        widgetsInflation();
        loadViewPagerFragments();
        profileImageClick();


        return mView;
    }

    private void profileImageClick() {
        mProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ProfileActivity.class));
            }
        });
    }

    private void loadViewPagerFragments() {
        TabsAccessorAdapter adapter = new
                TabsAccessorAdapter(getChildFragmentManager());

        adapter.setFragment(new AllShopFragment(), "All");
        adapter.setFragment(new CollectionsShopFragment(), "Collection");
        adapter.setFragment(new NewProductsShopFragment(), "New Product");
        adapter.setFragment(new PopularShopFragment(), "Popular");

        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setAdapter(adapter);


    }

    private void widgetsInflation() {
        mTabLayout = mView.findViewById(R.id.tab_layout_messages);
        mViewPager = mView.findViewById(R.id.view_pager_messages);
        mProfileImage = mView.findViewById(R.id.img_shop_profile);
    }

}
