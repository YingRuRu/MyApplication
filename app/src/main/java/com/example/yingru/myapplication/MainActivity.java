package com.example.yingru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    /**                view
     *        viewGroup   Button
     *  RelativeLayout
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.获取listview
        ListView listview = findViewById(R.id.lv);
        //不能直接添加，源码抛出异常
        //listview.addView(null);
       /* listview.setAdapter()*/

        //2.向listview填充数据
    }
    /*private  class MyAdapter implements BaseAdapter{


    }*/
}
