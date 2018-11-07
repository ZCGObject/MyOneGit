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


        findViewById(R.id.tv).setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "dianjiele" ,Toast.LENGTH_SHORT).show();
            Log.i("===>>>" , "ddddd");
        });



        Log.i("===>>>" , "ddddd");

        Log.i("===>>>" , "ddddd");

        Log.i("===>>>" , "ddddd");

        new Thread(() -> {

        }).start();


    }
}
