package com.example.pengyihao.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by pengyihao on 2017/9/2.
 */

// Activity is one of the classes under android SDK
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // contentview populate to the file activity_main.xml

    }

}
