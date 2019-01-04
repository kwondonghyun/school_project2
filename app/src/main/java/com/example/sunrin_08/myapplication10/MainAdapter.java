package com.example.sunrin_08.myapplication10;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    ArrayList<Content> al;

    MainAdapter(){
        al = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Content getItem(int position) {
        return al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        if(convertView ==null){
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.contents_main, parent, false);
        }

        TextView name = convertView.findViewById(R.id.content_name);
        TextView phone = convertView.findViewById(R.id.content_phone);
        TextView birth = convertView.findViewById(R.id.content_birth);

        Content ct = getItem(position);
        name.setText(ct.getName());
        phone.setText(ct.getPhone());
        birth.setText(ct.getBirth());

        return convertView;
    }



    public void addItem(String name, String phone, String birth){
        Content ct = new Content();
        ct.setName(name);
        ct.setPhone(phone);
        ct.setBirth(birth);
        al.add(ct);
    }
}
