package com.myapp.zarnimyosettwin.padc_assignment3.views.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class FoodItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public FoodItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
