package com.softrasol.ternaksukses.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ternaksukses.Adapters.ShopCategoryAdapter;
import com.softrasol.ternaksukses.Adapters.ShopNewProductAdapter;
import com.softrasol.ternaksukses.Models.ShopCategoryModel;
import com.softrasol.ternaksukses.Models.ShopNewProductModel;
import com.softrasol.ternaksukses.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllShopFragment extends Fragment {


    public AllShopFragment() {
        // Required empty public constructor
    }

    private View mView;
    private RecyclerView mRecyclerViewAllCategory, mRecyclerViewNewProducts;
    private List<ShopCategoryModel> shopCategoryList;
    private List<ShopNewProductModel> newProductList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_all_shop, container, false);

        widgetsInflation();
        shopAllCategoriesRecyclerViewImplementation();
        shopAllCategoriesnewProductsRecyclerView();

        return mView;
    }

    private void shopAllCategoriesnewProductsRecyclerView() {

        newProductList = new ArrayList<>();
        mRecyclerViewNewProducts.setLayoutManager
                (new GridLayoutManager(getContext(),2));

        newProductList.add(new ShopNewProductModel(R.drawable.img_itemprice1,
                "Product","Rp,145","New Town Ship"));
        newProductList.add(new ShopNewProductModel(R.drawable.img_itemprice2,
                "Product", "Rp,175","Bilter Town"));
        newProductList.add(new ShopNewProductModel(R.drawable.img_itemprice1,
                "Product","Rp,145","New Town Ship"));
        newProductList.add(new ShopNewProductModel(R.drawable.img_itemprice2,
                "Product", "Rp,175","Bilter Town"));
        newProductList.add(new ShopNewProductModel(R.drawable.img_itemprice1,
                "Product","Rp,145","New Town Ship"));
        newProductList.add(new ShopNewProductModel(R.drawable.img_itemprice2,
                "Product", "Rp,175","Bilter Town"));


        ShopNewProductAdapter adapter = new ShopNewProductAdapter(getContext(), newProductList);
        mRecyclerViewNewProducts.setAdapter(adapter);
    }

    private void shopAllCategoriesRecyclerViewImplementation() {

        shopCategoryList = new ArrayList<>();
        mRecyclerViewAllCategory.setLayoutManager(new LinearLayoutManager(getContext() , RecyclerView.HORIZONTAL,false));

        shopCategoryList.add(new ShopCategoryModel(R.drawable.pakan,"Pakan"));
        shopCategoryList.add(new ShopCategoryModel(R.drawable.hewan,"Hewan"));
        shopCategoryList.add(new ShopCategoryModel(R.drawable.mesin,"Mesin"));
        shopCategoryList.add(new ShopCategoryModel(R.drawable.jasa,"Jasa"));
        shopCategoryList.add(new ShopCategoryModel(R.drawable.lain_lain,"Lain Lain"));
        shopCategoryList.add(new ShopCategoryModel(R.drawable.obat,"Obat"));


        ShopCategoryAdapter adapter = new ShopCategoryAdapter(getContext(), shopCategoryList);
        mRecyclerViewAllCategory.setAdapter(adapter);

    }

    private void widgetsInflation() {
        mRecyclerViewAllCategory = mView.findViewById(R.id.recyclerview_shop_all_categories);
        mRecyclerViewNewProducts = mView.findViewById(R.id.recyclerview_shop_new_products);
    }


}
