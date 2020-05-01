package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.CommentsModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ViewHolder> {

    private Context context;
    private List<CommentsModel> list;

    public CommentsAdapter(Context context, List<CommentsModel> list){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.comments_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CommentsModel model = list.get(position);
        holder.imgDetailsProductCommentProfile.setImageResource(model.getImage());
        holder.txtDetailsPorductCommentMessage.setText(model.getMessage());
        holder.txtDetailsProductCommentLikes.setText(model.getNoOfLikes() + " Likes");
        holder.txtDetailsPorductCommentName.setText(model.getName());
        holder.txtDetailsPorductCommentTime.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView imgDetailsProductCommentProfile;
        private TextView txtDetailsPorductCommentName;
        private TextView txtDetailsPorductCommentTime;
        private TextView txtDetailsPorductCommentMessage;
        private TextView txtDetailsProductCommentLikes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDetailsProductCommentProfile = (CircleImageView) itemView.findViewById(R.id.img_details_product_comment_profile);
            txtDetailsPorductCommentName = (TextView) itemView.findViewById(R.id.txt_details_porduct_comment_name);
            txtDetailsPorductCommentTime = (TextView) itemView.findViewById(R.id.txt_details_porduct_comment_time);
            txtDetailsPorductCommentMessage = (TextView) itemView.findViewById(R.id.txt_details_porduct_comment_message);
            txtDetailsProductCommentLikes = (TextView) itemView.findViewById(R.id.txt_details_product_comment_likes);
        }
    }
}
