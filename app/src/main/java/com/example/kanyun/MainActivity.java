package com.example.kanyun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Hello World!
     */
    private TextView mTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
    private void initData() {
        Toast.makeText(this, "刘健康   你个 ...........(此处省略10000字)", Toast.LENGTH_SHORT).show();
    }


    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(this);
        mTv.setText("huaqianqian");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.tv:
                Toast.makeText(this, "刘健康", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
