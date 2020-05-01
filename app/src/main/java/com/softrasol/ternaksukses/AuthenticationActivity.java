package com.softrasol.ternaksukses;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AuthenticationActivity extends AppCompatActivity {

    private Button mBtnExisting, mBtnNewUser, mBtnLogin;
    private LinearLayout mLayoutExisting;
    private EditText mEdtUserName, mEdtEmail, mEdtPassword, mEdtConfirmPassword;

    //...............................................................................................
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        widgetsInflation();//XML widgets inflation

        existingButtonClick();
        newUserButtonClick();
        loginButtonClick();



    }
    //...............................................................................................

    private void loginButtonClick() {
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBtnLogin.getText().toString().equalsIgnoreCase("Log In")){
                    userLogin();
                }else {
                    registerUser();
                }
            }
        });
    }

    private void registerUser() {
        Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show();
    }

    private void userLogin() {
        Toast.makeText(this, "Log In", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }

    private void newUserButtonClick() {
        mBtnNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mBtnExisting.setBackgroundResource(R.drawable.btn_white_bg);
                mBtnExisting.setTextColor(Color.parseColor("#8A60D1"));
                mBtnNewUser.setBackgroundResource(R.drawable.btn_bg);
                mBtnNewUser.setTextColor(Color.parseColor("#FFFFFF"));
                mLayoutExisting.setVisibility(View.GONE);
                mEdtEmail.setVisibility(View.VISIBLE);
                mEdtConfirmPassword.setVisibility(View.VISIBLE);
                mBtnLogin.setText("Sign Up");

            }
        });
    }

    private void existingButtonClick() {

        mBtnExisting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnNewUser.setBackgroundResource(R.drawable.btn_white_bg);
                mBtnNewUser.setTextColor(Color.parseColor("#8A60D1"));
                mBtnExisting.setBackgroundResource(R.drawable.btn_bg);
                mBtnExisting.setTextColor(Color.parseColor("#FFFFFF"));
                mLayoutExisting.setVisibility(View.VISIBLE);
                mEdtEmail.setVisibility(View.GONE);
                mEdtConfirmPassword.setVisibility(View.GONE);
                mBtnLogin.setText("Log In");


            }
        });

    }

    private void widgetsInflation() {
        mBtnExisting = findViewById(R.id.btn_auth_existing);
        mBtnNewUser = findViewById(R.id.btn_auth_new_users);
        mLayoutExisting = findViewById(R.id.layout_login_existing);
        mEdtUserName = findViewById(R.id.edt_login_username);
        mEdtEmail = findViewById(R.id.edt_login_email);
        mEdtPassword = findViewById(R.id.edt_login_password);
        mEdtConfirmPassword = findViewById(R.id.edt_login_confirm_password);
        mBtnLogin = findViewById(R.id.btn_auth_login);
    }
}
