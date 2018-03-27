package com.assignment.sudoku;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Lenovo on 27-03-2018.
 */

public class GridAdapter extends BaseAdapter
{

    Context context;
   List<String> itemList;
    LayoutInflater inflater;

    public GridAdapter(Context contex, ArrayList<String> itemList)
    {
        this.context = context;
        this.itemList = itemList;
        inflater = LayoutInflater.from(contex);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public String getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView =  inflater.inflate(R.layout.grid_item, parent, false);
            mViewHolder = new MyViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }

       String name = getItem(position);

        mViewHolder.tvTitle.setText(name);


        return convertView;
    }

    private class MyViewHolder {
        TextView tvTitle, tvDesc;


        public MyViewHolder(View item) {
            tvTitle = (TextView) item.findViewById(R.id.text);


        }
    }
}