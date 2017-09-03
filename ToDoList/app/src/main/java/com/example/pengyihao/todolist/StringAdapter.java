package com.example.pengyihao.todolist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.List;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by pengyihao on 2017/9/3.
 */

public class StringAdapter extends ArrayAdapter<String> {
    private int mResource;
    private int mTextViewResource;

    private LayoutInflater mLayoutInflater;
    private List<String> mItems = new ArrayList<String>();

    public StringAdapter(Context context, int resource, int textViewResource){
        super(context, resource, textViewResource);

        mResource = resource;
        mTextViewResource = textViewResource;

        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // add dummy data
        mItems.add("AAA");
        mItems.add("BBB");
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(mResource, null);
            viewHolder = new ViewHolder();
            viewHolder.itemTextView = (TextView) convertView.findViewById(mTextViewResource);
            convertView.setTag(viewHolder);
        }

        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final String item = mItems.get(position);
        viewHolder.itemTextView.setText(item);

        return convertView;
    }

    static class ViewHolder{
        TextView itemTextView;
    }
}
