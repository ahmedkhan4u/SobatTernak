package com.softrasol.ternaksukses.Adapters;

import android.app.Notification;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ternaksukses.Models.NotificationsModel;
import com.softrasol.ternaksukses.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder> {


    private Context context;
    private List<NotificationsModel> list;

    public NotificationsAdapter(Context context, List<NotificationsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.notification_items_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NotificationsModel model = list.get(position);
        holder.imgNotificationsProfile.setImageResource(model.getImage());
        holder.imgNotificationsTypeIcon.setImageResource(model.getIcon());

        String boldText = model.getName();
        String normalText = " posted a new video";
        SpannableString str = new SpannableString(boldText + normalText);
        str.setSpan(new StyleSpan(Typeface.BOLD), 0, boldText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        holder.txtNotificationName.setText(str);
        holder.txtNotificationDescription.setText(model.getDescription());
        holder.txtNotificationTime.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        private RelativeLayout layoutProfileImg;
        private CircleImageView imgNotificationsProfile;
        private ImageView imgNotificationsTypeIcon;
        private TextView txtNotificationName;
        private TextView txtNotificationTime, txtNotificationDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutProfileImg = itemView.findViewById(R.id.layout_profile_img);
            imgNotificationsProfile = itemView.findViewById(R.id.img_notifications_profile);
            imgNotificationsTypeIcon = itemView.findViewById(R.id.img_notifications_type_icon);
            txtNotificationName = itemView.findViewById(R.id.txt_notification_name);
            txtNotificationTime = itemView.findViewById(R.id.txt_notification_time);
            txtNotificationDescription = itemView.findViewById(R.id.txt_notification_description);
        }


    }
}
