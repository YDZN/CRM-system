package com.example.jjj.crm_system.ui.Base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.jjj.crm_system.utils.ActivityUtil;

/**
 * Created by jjj on 2016/5/19 0019.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        ActivityUtil.addActivity(this);
        init();
        setContentView(getRootView());

        initData();
        setListener();

    }

    /**
     * 加载UI前的预初始化
     */
    protected abstract void init();

    /**
     * 加载布局
     * @return 布局id
     */
    protected abstract int getRootView();

    /**
     * 设置监听器
     */
    protected abstract void setListener();

    /**
     * 请求数据，设置UI
     */
    protected abstract void initData();



    /**
     * activity销毁后的操作
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 结束activity
     */
    @Override
    public void finish() {
        super.finish();
        ActivityUtil.removeActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
