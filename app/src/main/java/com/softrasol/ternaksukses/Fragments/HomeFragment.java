package com.softrasol.ternaksukses.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.softrasol.ternaksukses.Adapters.HomeItemsPriceAdapter;
import com.softrasol.ternaksukses.Adapters.HomePostsAdapter;
import com.softrasol.ternaksukses.Adapters.HomeProductsAdapter;
import com.softrasol.ternaksukses.ChatActivity;
import com.softrasol.ternaksukses.DetailsProductActivity;
import com.softrasol.ternaksukses.MessageActivity;
import com.softrasol.ternaksukses.Models.HomeItemsPriceModel;
import com.softrasol.ternaksukses.Models.HomePostsModel;
import com.softrasol.ternaksukses.Models.HomeProductsModel;
import com.softrasol.ternaksukses.ProfileActivity;
import com.softrasol.ternaksukses.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private View mView;
    private RecyclerView mRecyclerViewItemsPrice, mRecyclerViewProducts,
    mRecyclerViewPosts;
    private List<HomeItemsPriceModel> homeItemsPriceList;
    private List<HomeProductsModel> homeProductsList;
    private List<HomePostsModel> homePostsList;
    private Spinner mSpinner;
    private String []spinnerItems = {"Today","Yesterday", "Tomorrow"};
    private CircleImageView mProfileImage;
    private ImageView mMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_home, container, false);

        widgetsInflation();
        getHomeItemsPriceListData();
        spinnerImplementation();
        getHomeProductsList();
        getHomePostsData();
        profileImageClick();
        messageIconClicked();
        return mView;
    }

    private void messageIconClicked() {
        mMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MessageActivity.class));
            }
        });
    }

    private void profileImageClick() {
        mProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ProfileActivity.class));
            }
        });
    }

    private void getHomePostsData() {

        homePostsList = new ArrayList<>();
        mRecyclerViewPosts.setLayoutManager(new LinearLayoutManager(getContext()));

        homePostsList.add(new HomePostsModel(R.drawable.profile_image, "Martin Paimer", "Just Now",
                "New Post Added Lorem Ipsum Is a Dummy Text","image"));
        homePostsList.add(new HomePostsModel(R.drawable.profile_image, "John Doe", "1 min ago",
                "New Post Added Lorem Ipsum Is a Dummy Text","image"));

        HomePostsAdapter adapter = new HomePostsAdapter(getContext(), homePostsList);
        mRecyclerViewPosts.setAdapter(adapter);
    }

    private void getHomeProductsList() {

        homeProductsList = new ArrayList<>();
        mRecyclerViewProducts.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));

        homeProductsList.add(new HomeProductsModel(R.drawable.ayampanen,
                "Ayam Panem", "28.000"));
        homeProductsList.add(new HomeProductsModel(R.drawable.jagungmurah,
                "Jagug Murah", "4.200"));
        homeProductsList.add(new HomeProductsModel(R.drawable.mesinpelet,
                "Mesin Pelet", "30.000"));
        homeProductsList.add(new HomeProductsModel(R.drawable.pakanfermentasi,
                "Pakan Fermentasi", "2.000"));
        homeProductsList.add(new HomeProductsModel(R.drawable.pakanjadi,
                "Pakan Jadi", "4.200"));
        homeProductsList.add(new HomeProductsModel(R.drawable.pengadukpaki,
                "Pengaduk Pakan", "25.000"));

        HomeProductsAdapter adapter = new HomeProductsAdapter(getContext(), homeProductsList);
        mRecyclerViewProducts.setAdapter(adapter);
    }

    private void spinnerImplementation() {

        ArrayAdapter adapter = new ArrayAdapter(getContext(), R.layout.spinner_home_data, spinnerItems);
        mSpinner.setAdapter(adapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), spinnerItems[i]+"", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void getHomeItemsPriceListData() {

        homeItemsPriceList = new ArrayList<>();

        mRecyclerViewItemsPrice.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));


        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice1,"22.000"));
        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice2,"25.000"));
        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice3,"1.800"));
        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice4,"1.800"));
        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice5,"29.000"));
        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice6,"4.200"));
        homeItemsPriceList.add(new HomeItemsPriceModel(R.drawable.img_itemprice7,"5.000"));


        HomeItemsPriceAdapter adapter = new HomeItemsPriceAdapter(getContext(), homeItemsPriceList);
        mRecyclerViewItemsPrice.setAdapter(adapter);

    }

    private void widgetsInflation() {
        mRecyclerViewItemsPrice = mView.findViewById(R.id.recyclerview_home_items_price);
        mSpinner = mView.findViewById(R.id.spinner_home);
        mRecyclerViewProducts = mView.findViewById(R.id.recyclerview_home_products);
        mRecyclerViewPosts = mView.findViewById(R.id.recyclerview_home_posts);
        mProfileImage = mView.findViewById(R.id.home_profile_image);
        mMessage = mView.findViewById(R.id.home_message);
    }

}
