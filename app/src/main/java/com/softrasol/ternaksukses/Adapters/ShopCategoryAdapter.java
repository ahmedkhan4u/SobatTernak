package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.ShopCategoryModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

public class ShopCategoryAdapter extends RecyclerView.Adapter<ShopCategoryAdapter.ViewHolder> {

    private Context context;
    private List<ShopCategoryModel> list;

    public ShopCategoryAdapter(Context context, List<ShopCategoryModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.shop_categories_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ShopCategoryModel model = list.get(position);
        holder.mCategoryImage.setImageResource(model.getImage());
        holder.mTxtName.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mCategoryImage;
        private TextView mTxtName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mCategoryImage = itemView.findViewById(R.id.img_shop_category);
            mTxtName = itemView.findViewById(R.id.txt_shop_category_name);
        }
    }
}
