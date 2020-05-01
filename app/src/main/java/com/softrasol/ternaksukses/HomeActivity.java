package com.softrasol.ternaksukses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.softrasol.ternaksukses.Fragments.HomeFragment;
import com.softrasol.ternaksukses.Fragments.NotificationsFragment;
import com.softrasol.ternaksukses.Fragments.ShopFragment;
import com.softrasol.ternaksukses.Fragments.WebFragment;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        widgetsInflation();
        bottomNavigationImplementation();
        setFragment(new HomeFragment());


    }

    private void bottomNavigationImplementation() {

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        setFragment(new HomeFragment());
                        return true;

                    case R.id.nav_web:
                        setFragment(new WebFragment());
                        return true;

                    case R.id.nav_shop:
                        setFragment(new ShopFragment());
                        return true;

                    case R.id.nav_notification:
                        setFragment(new NotificationsFragment());
                        return true;

                        default:
                            return false;
                }
            }
        });

    }

    private void widgetsInflation() {
        mBottomNavigation = findViewById(R.id.bottom_navigation);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, fragment);
        transaction.commit();

    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
