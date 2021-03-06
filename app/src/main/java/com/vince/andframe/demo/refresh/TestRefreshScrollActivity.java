package com.vince.andframe.demo.refresh;

import android.os.Bundle;
import android.os.Handler;

import com.vince.aframe.R;
import com.vince.andframe.base.ui.activity.BaseBizActivity;
import com.vince.andframe.base.ui.widgets.refresh.OnRefreshListener;
import com.vince.andframe.base.ui.widgets.refresh.RefreshScrollView;

/**
 * Created by tianweixin on 2016-9-5.
 */

public class TestRefreshScrollActivity extends BaseBizActivity {
    private RefreshScrollView refreshScrollview;
    private Handler hander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_activity_refresh_scrollview);
        refreshScrollview = (RefreshScrollView) findViewById(R.id.refresh_scrollview);
        hander = new Handler();
        refreshScrollview.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                hander.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshScrollview.stopRefresh();
                    }
                }, 3000);
            }
        });
        topTitle();
    }

    private void topTitle() {
        setTitle("测试RefreshScrollView");
        needRight(false);
    }
}
