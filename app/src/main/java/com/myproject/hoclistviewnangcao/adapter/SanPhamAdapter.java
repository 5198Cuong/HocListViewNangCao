package com.myproject.hoclistviewnangcao.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.myproject.hoclistviewnangcao.R;
import com.myproject.hoclistviewnangcao.model.SanPham;

public class SanPhamAdapter extends ArrayAdapter<SanPham> {
    Activity context;
    int resource;
    public SanPhamAdapter(Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View customView = inflater.inflate(this.resource,null);

        ImageView imghinh = customView.findViewById(R.id.imageView);
        TextView txtTen = customView.findViewById(R.id.txtTen);
        TextView txtGia = customView.findViewById(R.id.txtGia);

        SanPham sp = getItem(position);
        imghinh.setImageResource(sp.getHinh());
        txtTen.setText(sp.getTen());
        txtGia.setText(sp.getGia()+"VND");
        return customView;
    }
}
