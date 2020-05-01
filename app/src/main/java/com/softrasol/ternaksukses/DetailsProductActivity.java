package com.softrasol.ternaksukses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.softrasol.ternaksukses.Adapters.CommentsAdapter;
import com.softrasol.ternaksukses.Adapters.SliderAdapterExample;
import com.softrasol.ternaksukses.Models.CommentsModel;
import com.softrasol.ternaksukses.Models.ImageSliderModel;

import java.util.ArrayList;
import java.util.List;

public class DetailsProductActivity extends AppCompatActivity {

    private List<ImageSliderModel> sliderImageList;
    private List<CommentsModel> commentsList;
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);

        widgetInflation();
        imgageSlider();
        initializeCommentsRecyclerView();

    }

    private void initializeCommentsRecyclerView() {
        commentsList = new ArrayList<>();
        commentsList.add(new CommentsModel(R.drawable.profile_image, "John Doe",
                "5 mins ago","Lorem Ipsum is a dummy text","5"));
        commentsList.add(new CommentsModel(R.drawable.profile_image, "John Doe",
                "Just Now","Lorem Ipsum is a dummy text","2"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        CommentsAdapter adapter = new CommentsAdapter(getApplicationContext(), commentsList);
        mRecyclerView.setAdapter(adapter);

    }

    private void widgetInflation() {
        mRecyclerView = findViewById(R.id.recyclerview_details_product_comments);
    }

    private void imgageSlider() {
        SliderView sliderView = findViewById(R.id.imageSlider);

        sliderImageList = new ArrayList<>();
        sliderImageList.add(new ImageSliderModel(R.drawable.logo));
        sliderImageList.add(new ImageSliderModel(R.drawable.round_icon));
        sliderImageList.add(new ImageSliderModel(R.drawable.logo));
        sliderImageList.add(new ImageSliderModel(R.drawable.logo));

        SliderAdapterExample adapter = new SliderAdapterExample(this,sliderImageList);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }

    public void BackClick(View view) {
        finish();
    }
}
