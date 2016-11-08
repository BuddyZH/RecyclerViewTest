package com.zzh.cm.recyclerviewtest.data;

import com.zzh.cm.recyclerviewtest.R;

import java.util.ArrayList;

/**
 * Created by zzh on 2016/11/8.
 */

public class DataUtils {
    private static ArrayList<Data> datas = new ArrayList<>();

    static {
        for (int i = 0 ; i < 100; i++) {
            Data data = new Data();
            data.setNum("num is " + i);
            data.setTime("2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx2016-01-01 xxx" + i);
            data.setResImage(R.mipmap.ic_launcher);
            datas.add(data);
        }
    }

    public static ArrayList<Data> getDatas() {
        return datas;
    }

    public static void setDatas(ArrayList<Data> datas) {
        DataUtils.datas = datas;
    }
}
