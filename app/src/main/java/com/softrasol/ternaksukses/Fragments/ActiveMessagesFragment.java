package com.softrasol.ternaksukses.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ternaksukses.Adapters.ActiveMessagesAdapter;
import com.softrasol.ternaksukses.Models.ActiveMessagesModel;
import com.softrasol.ternaksukses.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ActiveMessagesFragment extends Fragment {


    public ActiveMessagesFragment() {
        // Required empty public constructor
    }

    private View mView;
    private List<ActiveMessagesModel> activeMessagesList;
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_active_messages, container, false);

        widgetsInflation();
        activeMessagesRecyclerViewImplementation();

        return mView;
    }

    private void activeMessagesRecyclerViewImplementation() {

        activeMessagesList = new ArrayList<>();

        activeMessagesList.add(new ActiveMessagesModel(R.drawable.profile_image,"John Doe",
                "Lorem ipsum is a dummy text", "11:00"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.img_itemprice1,"Akara Doe",
                "Lorem ipsum is a dummy text", "Wed"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.logo,"Michal John",
                "Lorem ipsum is a dummy text", "Tue"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.profile_image,"John Doe",
                "Lorem ipsum is a dummy text", "11:00"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.img_itemprice1,"Akara Doe",
                "Lorem ipsum is a dummy text", "Wed"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.logo,"Michal John",
                "Lorem ipsum is a dummy text", "Tue"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.img_itemprice6,"John Doe",
                "Lorem ipsum is a dummy text", "11:00"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.img_itemprice3,"Akara Doe",
                "Lorem ipsum is a dummy text", "Wed"));
        activeMessagesList.add(new ActiveMessagesModel(R.drawable.round_icon,"Michal John",
                "Lorem ipsum is a dummy text", "Tue"));


        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ActiveMessagesAdapter adapter = new ActiveMessagesAdapter(getContext(), activeMessagesList);
        mRecyclerView.setAdapter(adapter);
    }

    private void widgetsInflation() {
        mRecyclerView = mView.findViewById(R.id.recyclerview_active_messages);
    }

}
