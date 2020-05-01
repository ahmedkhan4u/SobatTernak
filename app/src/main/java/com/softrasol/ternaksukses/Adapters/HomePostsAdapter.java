package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.HomePostsModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomePostsAdapter extends RecyclerView.Adapter<HomePostsAdapter.ViewHolder> {

    private Context context;
    private List<HomePostsModel> list;

    public HomePostsAdapter(Context context, List<HomePostsModel> homePostsList) {
        this.context = context;
        this.list = homePostsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.home_posts_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        HomePostsModel model = list.get(position);

        holder.mProfileImage.setImageResource(model.getImage());
        holder.mTxtProfileName.setText(model.getName());
        holder.mTxtTime.setText(model.getTime());
        holder.mTxtDescription.setText(model.getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView mProfileImage;
        private TextView mTxtProfileName, mTxtTime, mTxtDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mProfileImage = itemView.findViewById(R.id.img_home_post_profile);
            mTxtProfileName = itemView.findViewById(R.id.txt_home_post_profile_name);
            mTxtTime = itemView.findViewById(R.id.txt_home_post_time);
            mTxtDescription = itemView.findViewById(R.id.txt_home_post_description);

        }
    }
}
