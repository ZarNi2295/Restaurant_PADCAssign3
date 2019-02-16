package com.myapp.zarnimyosettwin.padc_assignment3.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapp.zarnimyosettwin.padc_assignment3.R;
import com.myapp.zarnimyosettwin.padc_assignment3.delegates.FoodItemDelegate;
import com.myapp.zarnimyosettwin.padc_assignment3.views.viewholders.FoodItemViewHolder;

public class FoodRecyclerAdapter extends RecyclerView.Adapter<FoodItemViewHolder> {
    private FoodItemDelegate foodItemDelegate;

    public FoodRecyclerAdapter(FoodItemDelegate foodItemDelegate) {
        this.foodItemDelegate = foodItemDelegate;
    }

    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_item_foods, viewGroup, false);
        return new FoodItemViewHolder(view,foodItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder foodItemViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
