package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.ArticleTabsModel;
import com.softrasol.ternaksukses.R;
import com.softrasol.ternaksukses.ViewCompleteArticleActivity;

import java.util.List;

public class ArticleTabsAdapter extends RecyclerView.Adapter<ArticleTabsAdapter.ViewHolder> {

    private Context context;
    private List<ArticleTabsModel> list;

    public ArticleTabsAdapter(Context context, List<ArticleTabsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.article_tab_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ArticleTabsModel model = list.get(position);
        holder.mImage.setImageResource(model.getImage());
        holder.mTxtTitle.setText(model.getTitle());
        holder.mTxtDescription.setText(model.getDescription());
        holder.mTxtSubhead.setText(model.getSubhead());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, ViewCompleteArticleActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImage;
        private TextView mTxtTitle, mTxtSubhead, mTxtDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.img_artile_tab_profile);
            mTxtTitle = itemView.findViewById(R.id.txt_article_title);
            mTxtSubhead = itemView.findViewById(R.id.txt_article_subhead);
            mTxtDescription = itemView.findViewById(R.id.txt_article_description);


        }
    }
}
