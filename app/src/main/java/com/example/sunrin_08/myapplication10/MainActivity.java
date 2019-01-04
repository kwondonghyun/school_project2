package com.example.sunrin_08.myapplication10;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    Button btn;
    EndDialog endDialog;
    ListView lv;
    MainAdapter ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.add_btn);
        lv = findViewById(R.id.lv);
        ma = new MainAdapter();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endDialog = new EndDialog(context);
                endDialog.setCancelable(false);
                endDialog.show();
            }
        });
    }
}
