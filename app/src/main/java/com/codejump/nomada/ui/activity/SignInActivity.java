package com.codejump.nomada.ui.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.codejump.nomada.R;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class SignInActivity extends ActionBarActivity {


    @InjectView(R.id.email)
    EditText username;
    @InjectView(R.id.password) EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.inject(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.im_logo_actionbar);
    }


    @OnClick(R.id.signin) void doSignIn() {
        String mUserName = username.getText().toString();
        String mPassword = username.getText().toString();

        validate(mUserName,mPassword);
    }

    private void validate(String mUserName, String mPassword) {

        View focus;
        boolean cancel = false;


        if(TextUtils.isEmpty(mUserName)){
            cancel = true;
            focus = username;
            shakeAnimation(focus);

        }

        if(TextUtils.isEmpty(mPassword)){
            cancel = true;
            focus = password;
            shakeAnimation(focus);
        }

        if(!cancel) registerUser();
        else
            Toast.makeText(this, getString(R.string.not_empty), Toast.LENGTH_SHORT).show();
    }



    private void shakeAnimation(View focus) {
        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        focus.startAnimation(shake);
    }

    private void registerUser() {

    }
}
