package com.lcs.androidcomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lcs.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button)
                .setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // 跳转login组件
                                ServiceFactory.getInstance().getmLogin().launch(MainActivity.this);
                            }
                        });

        findViewById(R.id.button2)
                .setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // 跳转mine组件
                                ServiceFactory.getInstance().getmMine().launch(MainActivity.this);
                            }
                        });
    }
}
