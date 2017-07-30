package com.example.administrator.l_mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;


import butterknife.BindView;

/**
 * Created by Administrator on 2017/7/30 0030.
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.am_tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        tv.setText("666");
    }
}
