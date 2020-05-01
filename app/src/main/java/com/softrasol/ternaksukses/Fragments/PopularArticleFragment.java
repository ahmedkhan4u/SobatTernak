package com.softrasol.ternaksukses.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ternaksukses.Adapters.ArticleTabsAdapter;
import com.softrasol.ternaksukses.Models.ArticleTabsModel;
import com.softrasol.ternaksukses.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopularArticleFragment extends Fragment {


    public PopularArticleFragment() {
        // Required empty public constructor
    }

    private RecyclerView mRecyclerViewTabs;
    private View mView;
    private List<ArticleTabsModel> tabsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_popular_article, container, false);

        mRecyclerViewTabs = mView.findViewById(R.id.recyclerview_article_tabs);

        implementPopularTabRecyclerView();

        return mView;
    }

    private void implementPopularTabRecyclerView() {

        tabsList = new ArrayList<>();
        mRecyclerViewTabs.setLayoutManager(new LinearLayoutManager(getContext()));

        tabsList.add(new ArticleTabsModel(R.drawable.article_sample1,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.article_sample2,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.article_sample3,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.article_sample_4,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.article_sample_5,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.article_sample6,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.article_sample7,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));

        ArticleTabsAdapter adapter = new ArticleTabsAdapter(getContext(), tabsList);
        mRecyclerViewTabs.setAdapter(adapter);
    }

}
