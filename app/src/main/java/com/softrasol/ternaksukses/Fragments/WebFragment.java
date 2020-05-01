package com.softrasol.ternaksukses.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.google.android.material.tabs.TabLayout;
import com.softrasol.ternaksukses.Adapters.ArticleAdapter;
import com.softrasol.ternaksukses.Adapters.TabsAccessorAdapter;
import com.softrasol.ternaksukses.Models.ArticleModel;
import com.softrasol.ternaksukses.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {


    public WebFragment() {
        // Required empty public constructor
    }

    private View mView;
    private RecyclerView mRecyclerViewArticle;
    private List<ArticleModel> articleList;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_web, container, false);

        widgetsInflation();
        loadViewPagerFragments();
        articleRecyclerViewImplementation();


        return mView;
    }

    private void articleRecyclerViewImplementation() {

        articleList = new ArrayList<>();

        mRecyclerViewArticle.setLayoutManager(new LinearLayoutManager(getContext(),
                RecyclerView.HORIZONTAL, false));

        articleList.add(new ArticleModel(R.drawable.ayam_petelur1, "Ayam Petelur",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.puyuh2, "Puyuh",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.ayam_arab3, "Aram Arab",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.bebek4, "Bebek",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.kesehatan5, "Kesehatan",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.lain_lain6, "Lain Lain",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.info7, "Info",
                "Lorem Ipsum is text......"));
        articleList.add(new ArticleModel(R.drawable.tip_trik8, "Tip Trik",
                "Lorem Ipsum is text......"));

        ArticleAdapter adapter = new ArticleAdapter(getActivity(), articleList);
        mRecyclerViewArticle.setAdapter(adapter);

    }

    private void widgetsInflation() {
        mRecyclerViewArticle = mView.findViewById(R.id.recyclerview_articles);
        mTabLayout = mView.findViewById(R.id.tab_layout_messages);
        mViewPager = mView.findViewById(R.id.view_pager_messages);
    }

    private void loadViewPagerFragments() {
        TabsAccessorAdapter adapter = new
                TabsAccessorAdapter(getChildFragmentManager());

        adapter.setFragment(new PopularArticleFragment(), "Popular");
        adapter.setFragment(new CollectionsShopFragment(), "Newest");


        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setAdapter(adapter);


    }


}
