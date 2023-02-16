package com.example.hw_3_33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> productsList;
    private ProductsAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_products);
        loadData();
        adapter = new ProductsAdapter(productsList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        productsList = new ArrayList<>();
        productsList.add("Potato");
        productsList.add("Tomato");
        productsList.add("Beef");
        productsList.add("Meat");
        productsList.add("Pike");
        productsList.add("Beet");
        productsList.add("Carrot");
        productsList.add("Cucumber");
        productsList.add("Garlic");
        productsList.add("Onion");
        productsList.add("Pea");
        productsList.add("Pepper");
        productsList.add("Turnip");
    }
}