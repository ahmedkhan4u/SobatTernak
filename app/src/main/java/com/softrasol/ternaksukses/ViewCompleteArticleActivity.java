package com.softrasol.ternaksukses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.softrasol.ternaksukses.Adapters.ArticleTabsAdapter;
import com.softrasol.ternaksukses.Adapters.CommentsAdapter;
import com.softrasol.ternaksukses.Adapters.SliderAdapterExample;
import com.softrasol.ternaksukses.Models.ArticleTabsModel;
import com.softrasol.ternaksukses.Models.CommentsModel;
import com.softrasol.ternaksukses.Models.ImageSliderModel;

import java.util.ArrayList;
import java.util.List;

public class ViewCompleteArticleActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewRelatedArticles, mRecyclerViewCompArticleComments;
    private List<ArticleTabsModel> tabsList;
    private List<CommentsModel> commentsList;
    private List<ImageSliderModel> sliderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_complete_article);

        widgetInflation();
        implementPopularTabRecyclerView();
        initializeCommentsRecyclerView();
        imageSliderImplementation();
    }

    private void imageSliderImplementation() {
        SliderView sliderView = findViewById(R.id.imageSlider);
        sliderList = new ArrayList<>();
        sliderList.add(new ImageSliderModel(R.drawable.pakan));
        sliderList.add(new ImageSliderModel(R.drawable.pengadukpaki));
        sliderList.add(new ImageSliderModel(R.drawable.hewan));


        SliderAdapterExample adapter = new SliderAdapterExample(getApplicationContext(), sliderList);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }

    private void widgetInflation() {
        mRecyclerViewRelatedArticles =
                findViewById(R.id.recyclerview_complete_related_articles);
        mRecyclerViewCompArticleComments =
                findViewById(R.id.recyclerview_complete_article_comments);
    }

    public void BackClick(View view) {
        finish();
    }

    public void ProfileClick(View view) {
        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
    }

    private void initializeCommentsRecyclerView() {
        commentsList = new ArrayList<>();
        commentsList.add(new CommentsModel(R.drawable.profile_image, "John Doe",
                "5 mins ago","Lorem Ipsum is a dummy text","5"));
        commentsList.add(new CommentsModel(R.drawable.profile_image, "John Doe",
                "Just Now","Lorem Ipsum is a dummy text","2"));
        mRecyclerViewCompArticleComments.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        CommentsAdapter adapter = new CommentsAdapter(getApplicationContext(), commentsList);
        mRecyclerViewCompArticleComments.setAdapter(adapter);

    }



    private void implementPopularTabRecyclerView() {

        tabsList = new ArrayList<>();
        mRecyclerViewRelatedArticles.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        tabsList.add(new ArticleTabsModel(R.drawable.img_itemprice1,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.img_itemprice1,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));
        tabsList.add(new ArticleTabsModel(R.drawable.img_itemprice1,"Design",
                "Contray to popular belief","Lorem ipsum is dummy text example..."));

        ArticleTabsAdapter adapter = new ArticleTabsAdapter(getApplicationContext(), tabsList);
        mRecyclerViewRelatedArticles.setAdapter(adapter);
    }
}
