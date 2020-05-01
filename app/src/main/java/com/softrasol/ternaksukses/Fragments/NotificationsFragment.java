package com.softrasol.ternaksukses.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ternaksukses.Adapters.NotificationsAdapter;
import com.softrasol.ternaksukses.Models.NotificationsModel;
import com.softrasol.ternaksukses.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {


    public NotificationsFragment() {
        // Required empty public constructor
    }

    private View mView;
    private RecyclerView mRecyclerView;
    private List<NotificationsModel> notificationsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerViewImplementation();

        return mView;
    }

    private void recyclerViewImplementation() {

        notificationsList = new ArrayList<>();
        mRecyclerView = mView.findViewById(R.id.recyclerview_notifications);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        notificationsList.add(new NotificationsModel(R.drawable.profile_image,R.drawable.ic_camers,
                "John Doe","New notification","Just Now"));
        notificationsList.add(new NotificationsModel(R.drawable.logo,R.drawable.ic_location,
                "Michael John","Lorem Ipsum is dummy text for the testing of dummy text"
                ,"2 hours ago"));
        notificationsList.add(new NotificationsModel(R.drawable.profile_image,R.drawable.ic_camers,
                "John Doe","Here is some text...","Just Now"));
        notificationsList.add(new NotificationsModel(R.drawable.logo,R.drawable.ic_location,
                "Michael John","New notification","2 hours ago"));
        notificationsList.add(new NotificationsModel(R.drawable.profile_image,R.drawable.ic_camers,
                "John Doe","New notification","Just Now"));
        notificationsList.add(new NotificationsModel(R.drawable.logo,R.drawable.ic_location,
                "Michael John","New notification","2 hours ago"));


        NotificationsAdapter adapter = new NotificationsAdapter(getContext(), notificationsList);
        mRecyclerView.setAdapter(adapter);

    }

}
