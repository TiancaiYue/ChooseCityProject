package com.shichuang.choosecityproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTvAddress;
    private Button mBtnChoose;
    private ChooseCityClass chooseCityClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTvAddress = (TextView) findViewById(R.id.tv_address);
        mBtnChoose = (Button) findViewById(R.id.btn_choose);
        chooseCityClass = new ChooseCityClass(this, mTvAddress);
        chooseCityClass.initCitySelectData();
        mBtnChoose.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_choose:
                chooseCityClass.show();
                break;
        }
    }
}
