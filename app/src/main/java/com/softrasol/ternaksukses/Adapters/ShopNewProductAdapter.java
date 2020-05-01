package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.ShopNewProductModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

public class ShopNewProductAdapter extends RecyclerView.Adapter<ShopNewProductAdapter.ViewHolder> {

    private Context context;
    private List<ShopNewProductModel> list;

    public ShopNewProductAdapter(Context context, List<ShopNewProductModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.shop_new_product_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ShopNewProductModel model = list.get(position);
        holder.mImgNewProduct.setImageResource(model.getImage());
        holder.mTxtPrice.setText(model.getPrice());
        holder.mTxtLocation.setText(model.getLocation());
        holder.mTxtName.setText(model.getName());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImgNewProduct;
        private TextView mTxtName, mTxtPrice, mTxtLocation;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImgNewProduct = itemView.findViewById(R.id.img_shop_new_product);
            mTxtPrice = itemView.findViewById(R.id.txt_shop_new_product_price);
            mTxtLocation = itemView.findViewById(R.id.txt_new_product_location);
            mTxtName = itemView.findViewById(R.id.txt_new_product_name);
        }
    }
}
