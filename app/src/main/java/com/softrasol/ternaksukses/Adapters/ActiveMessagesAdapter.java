package com.softrasol.ternaksukses.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.ChatActivity;
import com.softrasol.ternaksukses.Models.ActiveMessagesModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ActiveMessagesAdapter extends RecyclerView.Adapter<ActiveMessagesAdapter.ViewHolder> {

    private Context context;
    private List<ActiveMessagesModel> list;

    public ActiveMessagesAdapter(Context context, List<ActiveMessagesModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.active_messages_items_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ActiveMessagesModel model = list.get(position);
        holder.mProfileImage.setImageResource(model.getImage());
        holder.mTxtName.setText(model.getName());
        holder.mTxtMessage.setText(model.getMessage());
        holder.mTxtTime.setText(model.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, ChatActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView mProfileImage;
        private TextView mTxtName, mTxtMessage, mTxtTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mProfileImage = itemView.findViewById(R.id.img_messages_profile);
            mTxtName = itemView.findViewById(R.id.txt_messages_profile_name);
            mTxtMessage = itemView.findViewById(R.id.txt_messages_description);
            mTxtTime = itemView.findViewById(R.id.txt_messages_time);
        }
    }
}
