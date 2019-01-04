package com.example.sunrin_08.myapplication10;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EndDialog extends Dialog {
    private Context context;
    MainAdapter ma;
    EditText c_name, c_birth, c_phone;
    private TextView btn_cancel;
    private TextView btn_ok;

    public EndDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_main);

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_ok = findViewById(R.id.btn_ok);
        ma = ((MainActivity) context).ma;
        c_name = findViewById(R.id.edit_name);
        c_phone = findViewById(R.id.edit_phone);
        c_birth = findViewById(R.id.edit_birth);


        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) context).lv.setAdapter(ma);
                ma.addItem(c_name.getText().toString(), c_phone.getText().toString(), c_birth.getText().toString());
                dismiss();
            }
        });

    }
}
