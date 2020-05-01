package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.ArticleModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder> {

    private Context context;
    private List<ArticleModel> list;

    public ArticleAdapter(Context context, List<ArticleModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.article_items_view_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        ArticleModel model = list.get(position);
        holder.mImageArticle.setImageResource(model.getImage());
        holder.mTxtTitle.setText(model.getTitle());
        holder.mTxtDescription.setText(model.getDescription());

        holder.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b == true) {
                    // run scale animation and make it bigger
                    Animation anim = AnimationUtils.loadAnimation(context, R.anim.scale_in_tv);
                    holder.itemView.startAnimation(anim);
                    anim.setFillAfter(true);
                    Toast.makeText(context, "Focus True", Toast.LENGTH_SHORT).show();
                } else {
                    // run scale animation and make it smaller
                    Animation anim = AnimationUtils.loadAnimation(context, R.anim.scale_out_tv);
                    holder.itemView.startAnimation(anim);
                    anim.setFillAfter(true);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageArticle;
        private TextView mTxtTitle, mTxtDescription;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            mImageArticle = itemView.findViewById(R.id.img_article);
            mTxtDescription = itemView.findViewById(R.id.txt_article_description);
            mTxtTitle = itemView.findViewById(R.id.txt_article_title);
        }
    }
}
