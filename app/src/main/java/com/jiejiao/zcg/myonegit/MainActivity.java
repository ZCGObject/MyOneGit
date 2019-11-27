package com.jiejiao.zcg.myonegit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //我是第一个Tag v1.0

        //我是第二个Tag v2.0










        //添加了一个注释测试是否能够合并远程分支

        //哈哈哈
        findViewById(R.id.tv).setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "dianjiele" ,Toast.LENGTH_SHORT).show();
            Log.i("===>>>" , "ddddd");
        });





        //nawoey  dhfhsdk 

        //和覅的身份hi士大夫

        Log.i("===>>>" , "ddddd");

        Log.i("===>>>" , "ddddd");

        Log.i("===>>>" , "ddddd");


        //增加了一行注释  master
        new Thread(() -> {

        }).start();

        
        //在最后添加得注释1.1.0
        //kkkkkkkkkk在最后添加得注释1.1.0


    }
}
