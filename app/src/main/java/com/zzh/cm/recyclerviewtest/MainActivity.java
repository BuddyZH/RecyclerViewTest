package com.zzh.cm.recyclerviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

import com.zzh.cm.recyclerviewtest.data.DataUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("===MainActivity", "onCreate");
        setContentView(R.layout.activity_main);

/*
        final MyImageView myImageView = (MyImageView) findViewById(R.id.imageview);
*/

        /**
         * 在onCreate获取view 宽度和高度的三种方法 http://souly.cn/%E6%8A%80%E6%9C%AF%E5%8D%9A%E6%96%87/2015/11/16/viewTreeObserver%E8%A7%A3%E6%9E%90/
         */
        /*int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        myImageView.measure(w, h);
        Log.d("===MainActivity", "onCreate执行完毕..myImageView" + " height:" + myImageView.getMeasuredHeight() + " ,width:" + myImageView.getMeasuredWidth());*/

        /*ViewTreeObserver vto = myImageView.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                int height = myImageView.getMeasuredHeight();
                int width = myImageView.getMeasuredWidth();
                Log.d("===PreDrawListener", "PreDrawListener..myImageView " +
                        "height:" + height + "  ,width:" + width);
                myImageView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        Log.d("===MainActivity", "onCreate执行完毕..myImageView" + " height:" + myImageView.getMeasuredHeight() + ", width:" + myImageView.getMeasuredWidth());*/

        /*ViewTreeObserver vto1 = myImageView.getViewTreeObserver();
        vto1.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                myImageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Log.d("===OnGlobalLayout", "OnGlobalLayoutListener..myImageView " + "height:" + myImageView.getHeight() + ", width:" + myImageView.getWidth());
            }
        });
        Log.d("===MainActivity", "onCreate执行完毕..myImageView" + " height:" + myImageView.getHeight() + ", width:" + myImageView.getWidth());*/

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new DemoAdapter(this, DataUtils.getDatas()));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("===MainActivity", "onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("===MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("===MainActivity", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("===MainActivity", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("===MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("===MainActivity", "onDestroy");
    }

}
