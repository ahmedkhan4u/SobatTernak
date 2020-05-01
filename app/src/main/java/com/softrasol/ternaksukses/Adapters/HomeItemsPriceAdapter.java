package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.HomeItemsPriceModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

public class HomeItemsPriceAdapter extends RecyclerView.Adapter<HomeItemsPriceAdapter.ViewHolder> {

    private Context context;
    private List<HomeItemsPriceModel> list;

    public HomeItemsPriceAdapter(Context context, List<HomeItemsPriceModel> homeItemsPriceList) {
        this.context = context;
        this.list = homeItemsPriceList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.home_item_price_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final HomeItemsPriceModel model = list.get(position);

        holder.mItemPrice.setText(model.getPrice());
        holder.mItemImage.setImageResource(model.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, model.getPrice(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mItemImage;
        private TextView mItemPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mItemImage = itemView.findViewById(R.id.img_home_item_price);
            mItemPrice = itemView.findViewById(R.id.txt_home_item_price);

        }
    }
}
