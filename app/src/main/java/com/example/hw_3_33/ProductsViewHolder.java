package com.example.hw_3_33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvProducts;

    public ProductsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvProducts = itemView.findViewById(R.id.tv_contacts);
    }

    void bind(String products){
        tvProducts.setText(products);
    };
}
