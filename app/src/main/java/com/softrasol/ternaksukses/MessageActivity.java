package com.softrasol.ternaksukses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;
import com.softrasol.ternaksukses.Adapters.TabsAccessorAdapter;
import com.softrasol.ternaksukses.Fragments.ActiveMessagesFragment;
import com.softrasol.ternaksukses.Fragments.ArchieveMessagesFragment;
import com.softrasol.ternaksukses.Fragments.FinishedMessagesFragment;
import com.softrasol.ternaksukses.Fragments.NewRequestMessagesFragment;

public class MessageActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        widgetsInflation();
        loadViewPagerFragments();


    }

    private void loadViewPagerFragments() {
        TabsAccessorAdapter adapter = new
                TabsAccessorAdapter(getSupportFragmentManager());

        adapter.setFragment(new ActiveMessagesFragment(), "Active");
        adapter.setFragment(new NewRequestMessagesFragment(), "New Request");
        adapter.setFragment(new FinishedMessagesFragment(), "Finished");
        adapter.setFragment(new ArchieveMessagesFragment(), "Archive");

        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setAdapter(adapter);


    }

    private void widgetsInflation() {
        mTabLayout = findViewById(R.id.tab_layout_messages);
        mViewPager = findViewById(R.id.view_pager_messages);
    }

    public void BackClick(View view) {
        finish();
    }

    public void ProfileClick(View view) {
        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
    }
}
