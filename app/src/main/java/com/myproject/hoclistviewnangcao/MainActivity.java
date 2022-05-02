package com.myproject.hoclistviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.myproject.hoclistviewnangcao.adapter.SanPhamAdapter;
import com.myproject.hoclistviewnangcao.model.SanPham;

public class MainActivity extends AppCompatActivity {
    ListView lvSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        fakeData();
    }

    private void fakeData() {
        sanPhamAdapter.add(new SanPham(R.drawable.h1,"gun1",15000000));
        sanPhamAdapter.add(new SanPham(R.drawable.h2,"gun2",25000000));
        sanPhamAdapter.add(new SanPham(R.drawable.h3,"gun3",45000000));
        sanPhamAdapter.add(new SanPham(R.drawable.h4,"gun4",65000000));
        sanPhamAdapter.add(new SanPham(R.drawable.h5,"gun5",35000000));
        sanPhamAdapter.add(new SanPham(R.drawable.h6,"gun6",85000000));




    }

    private void addEvents() {
        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SanPham sp = sanPhamAdapter.getItem(i);
                Toast.makeText(MainActivity.this,"Bạn Chọn: "+sp.getTen(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControls() {
        lvSanPham = findViewById(R.id.lvSanPham);
        sanPhamAdapter = new SanPhamAdapter(MainActivity.this,R.layout.item);
        lvSanPham.setAdapter(sanPhamAdapter);
    }
}