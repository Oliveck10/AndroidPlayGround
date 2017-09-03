package com.example.pengyihao.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.support.annotation.Nullable;

/**
 * Created by pengyihao on 2017/9/2.
 */

// Activity is one of the classes under android SDK
public class MainActivity extends Activity {

    private StringAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // contentview populate to the file activity_main.xml


        mAdapter = new StringAdapter(this, R.layout.list_item, R.id.list_item_textview);

        ListView listView = (ListView) findViewById(R.id.activity_main_listview);
        listView.setAdapter(mAdapter);

    }

}
