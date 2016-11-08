package com.zzh.cm.recyclerviewtest;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zzh.cm.recyclerviewtest.data.Data;

import java.util.List;

/**
 * Created by zzh on 2016/11/8.
 */

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.VH> {
    private List<Data> dataList;
    private Context context;

    public DemoAdapter(Context context, List<Data> dataList) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VH(View.inflate(context, android.R.layout.simple_expandable_list_item_2, null));
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.mTextView.setText(dataList.get(position).getNum());
        if (position % 2 == 0) {
            holder.mDescTextView.setVisibility(View.VISIBLE);
            holder.mDescTextView.setText(dataList.get(position).getTime());
        } else {
            holder.mDescTextView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class VH extends RecyclerView.ViewHolder {
        TextView mTextView;
        TextView mDescTextView;
        public VH(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(android.R.id.text1);
            mDescTextView = (TextView) itemView.findViewById(android.R.id.text2);
        }
    }

}
