package com.zzh.cm.recyclerviewtest.data;

import android.support.annotation.DrawableRes;

/**
 * Created by zzh on 2016/11/8.
 */

public class Data {
    private String num;
    private String time;
    @DrawableRes
    private int resImage;

    public int getResImage() {
        return resImage;
    }

    public void setResImage(int resImage) {
        this.resImage = resImage;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
