package com.example.pengyihao.todolist;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.List;

import java.util.ArrayList;

/**
 * Created by pengyihao on 2017/9/3.
 */

public class StringAdapter extends ArrayAdapter<String> {
    private int mResource;
    private int mTextViewResource;

    private LayoutInflater mLayoutInflater;
    private List<String> mitems = new ArrayList<String>();

    public StringAdapter(Context context, int resource, int textViewResource){
        super(context, resource, textViewResource);

        mResource = resource;
        mTextViewResource = textViewResource;

        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

}
