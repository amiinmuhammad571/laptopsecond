package com.madev.laptopsecond;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Laptop> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(LaptopData.getListData());
        showRecyclerlist();

    }
    private void showRecyclerlist(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListLaptopAdapter listLaptopAdapter = new ListLaptopAdapter(this);
        listLaptopAdapter.setListLaptop(list);
        rvCategory.setAdapter(listLaptopAdapter);
        listLaptopAdapter.setOnItemClickCallback(new ListLaptopAdapter.OnItemClickCallback() {
    @Override
    public void onItemClicked(Laptop data) {
        showSelectedLaptop(data);

    }
});

    }
    private void showSelectedLaptop(Laptop laptop){
//        Toast.makeText(this, "Kamu memilih "+laptop.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);

    }
}
