package com.myapp.zarnimyosettwin.padc_assignment3.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.myapp.zarnimyosettwin.padc_assignment3.R;
import com.myapp.zarnimyosettwin.padc_assignment3.adapters.FoodRecyclerAdapter;
import com.myapp.zarnimyosettwin.padc_assignment3.delegates.FoodItemDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements FoodItemDelegate {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_foods)
    RecyclerView rvFoods;

    public static Intent onNewIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this, this);
        rvFoods.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        FoodRecyclerAdapter foodRecyclerAdapter = new FoodRecyclerAdapter(this);
        rvFoods.setAdapter(foodRecyclerAdapter);

    }

    @Override
    public void onTapFoodItem() {
        Intent intent = FoodDetailActivity.onNewIntent(getApplicationContext());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
