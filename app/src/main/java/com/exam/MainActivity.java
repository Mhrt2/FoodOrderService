package com.exam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



import com.exam.adapters.MainAdapter;
import com.exam.models.MainModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger, "Burger", "5",  "Chicken Burger with Extra cheese") );
        list.add(new MainModel(R.drawable.pizza, "pizza", "0",  "The offer to download the coupons ends thursday March 4") );
        list.add(new MainModel(R.drawable.por, "Portobello Mushroom", "12",  "Meaty portobello mushrooms make for") );
        list.add(new MainModel(R.drawable.img2, " Pizza Burger", "5",  "Burger O'clock is available to satiate your") );
        list.add(new MainModel(R.drawable.burger, "Burger", "5",  "Chicken Burger with Extra cheese") );
        MainAdapter adapter= new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager( this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.orders:
                startActivity(new Intent( MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}