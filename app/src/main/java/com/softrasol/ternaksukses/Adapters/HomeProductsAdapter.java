package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.DetailsProductActivity;
import com.softrasol.ternaksukses.Models.HomeProductsModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeProductsAdapter extends RecyclerView.Adapter<HomeProductsAdapter.ViewHolder> {

    private Context context;
    private List<HomeProductsModel> list;

    public HomeProductsAdapter(Context context, List<HomeProductsModel> homeProductsList) {
        this.context = context;
        this.list = homeProductsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.home_products_item_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final HomeProductsModel model = list.get(position);

        holder.mProductImage.setImageResource(model.getImage());
        holder.mTxtProductName.setText(model.getProductName());
        holder.mTxtProductPrice.setText(model.getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DetailsProductActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView mProductImage;
        private TextView mTxtProductName, mTxtProductPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mProductImage = itemView.findViewById(R.id.img_home_product);
            mTxtProductName = itemView.findViewById(R.id.txt_home_product_name);
            mTxtProductPrice = itemView.findViewById(R.id.txt_home_product_price);
        }
    }
}
