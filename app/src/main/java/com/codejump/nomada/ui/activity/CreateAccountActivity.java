package com.codejump.nomada.ui.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.codejump.nomada.R;
import butterknife.ButterKnife;

public class CreateAccountActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        ButterKnife.inject(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.im_logo_actionbar);
    }
}
