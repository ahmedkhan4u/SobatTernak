package com.softrasol.ternaksukses;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.ContextCompat;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

import static com.softrasol.ternaksukses.R.color;
import static com.softrasol.ternaksukses.R.drawable;

public class OnBoardingActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard
                ("Selamat Datang di Group Sobat Ternak ",
                        "Dapat info harga setiap hari secara gratis. Mulai dari harga telur ayam, puyuh, bebek, ayam arab, afkir, bekatul, jagung dll. nikmati bersama dan indahnya berbagi", drawable.onboard1);
        ahoyOnboarderCard1.setBackgroundColor(color.white);
        ahoyOnboarderCard1.setTitleColor(color.black);
        ahoyOnboarderCard1.setDescriptionColor(color.greyColor);
        ahoyOnboarderCard1.setTitleTextSize(dpToPixels(8, this));
        ahoyOnboarderCard1.setDescriptionTextSize(dpToPixels(6, this));
        ahoyOnboarderCard1.setIconLayoutParams
                (600, 500, 16, 0, 0, 48);



        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard
                ("Silaturahmi sesama peternak mempererat pesaudaraan",
                        "Sesama Peternak selalu menjaga silaturahmi dan persaudaraan. kita bisa melakukan post, comment, sharing info, dan berbagi artikel tentang ternak", drawable.onboard2);
        ahoyOnboarderCard2.setBackgroundColor(color.white);
        ahoyOnboarderCard2.setTitleColor(color.black);
        ahoyOnboarderCard2.setDescriptionColor(color.greyColor);
        ahoyOnboarderCard2.setTitleTextSize(dpToPixels(8, this));
        ahoyOnboarderCard2.setDescriptionTextSize(dpToPixels(6, this));
        ahoyOnboarderCard2.setIconLayoutParams
                (600, 500, 16, 0, 0, 48);



        AhoyOnboarderCard ahoyOnboarderCard3 = new AhoyOnboarderCard
                ("Jual beli sesama member",
                        "Yuk dulur yang share jual beli tentang peternakan atau jasa bidang peternakan. monggo semoga bermanfaat", drawable.onboard3);
        ahoyOnboarderCard3.setBackgroundColor(color.white);
        ahoyOnboarderCard3.setTitleColor(color.black);
        ahoyOnboarderCard3.setDescriptionColor(color.greyColor);
        ahoyOnboarderCard3.setTitleTextSize(dpToPixels(8, this));
        ahoyOnboarderCard3.setDescriptionTextSize(dpToPixels(6, this));
        ahoyOnboarderCard3.setIconLayoutParams
                (600, 500, 16, 0, 0, 48);


        List<AhoyOnboarderCard> pages = new ArrayList<>();
        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);
        pages.add(ahoyOnboarderCard3);
        setColorBackground(color.white);

        setOnboardPages(pages);

        //Set pager indicator colors
        setInactiveIndicatorColor(color.greyColor);
        setActiveIndicatorColor(color.colorPrimary);

//Set finish button text
        setFinishButtonTitle("Finish");

//Set the finish button style
        setFinishButtonDrawableStyle(ContextCompat.getDrawable(this, drawable.button_finish_bg));

    }

    @Override
    public void onFinishButtonPressed() {

        startActivity(new Intent(getApplicationContext(), AuthenticationActivity.class));
        finish();
    }
}
