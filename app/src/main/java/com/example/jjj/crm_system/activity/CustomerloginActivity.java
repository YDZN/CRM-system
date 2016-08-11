package com.example.jjj.crm_system.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jjj.crm_system.R;
import com.example.jjj.crm_system.ui.Base.BaseActivity;

public class CustomerloginActivity extends BaseActivity {
    private EditText et_phonenum_customerlogin;
    private Button bt_sendVerificationcode_customerlogin;
    private EditText et_VerificationCode_customerlogin;
    private TextView tv_back_customerlogin;
    private Button bt_login_customerlogin;

    @Override
    protected int getRootView() {
        return R.layout.activity_customerlogin;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initData() {
        et_phonenum_customerlogin = (EditText)findViewById(R.id.et_phonenum_customerlogin);
        et_VerificationCode_customerlogin = (EditText)findViewById(R.id.et_VerificationCode_customerlogin);
        bt_sendVerificationcode_customerlogin = (Button)findViewById(R.id.bt_getVerificationcode_customerlogin);
        tv_back_customerlogin = (TextView)findViewById(R.id.tv_back_customerlogin);
        bt_login_customerlogin = (Button)findViewById(R.id.bt_login_customerlogin);
    }

    @Override
    protected void setListener() {
        tv_back_customerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt_sendVerificationcode_customerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerloginActivity.this,CustomerActivity.class);
                startActivity(intent);
            }
        });
        bt_login_customerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerloginActivity.this,CustomerActivity.class);
                startActivity(intent);
            }
        });

    }
}
