package com.myapp.zarnimyosettwin.padc_assignment3.views.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.myapp.zarnimyosettwin.padc_assignment3.delegates.FoodItemDelegate;

public class FoodItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private FoodItemDelegate foodItemDelegate;

    public FoodItemViewHolder(@NonNull View itemView, FoodItemDelegate foodItemDelegate) {
        super(itemView);
        this.foodItemDelegate = foodItemDelegate;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        foodItemDelegate.onTapFoodItem();
    }
}
