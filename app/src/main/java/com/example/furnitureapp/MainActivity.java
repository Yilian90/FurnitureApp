package com.example.furnitureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList; // import the ArrayList class
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Step 1: Designing Main Layout
    //Step 2: CardView Design (Primary Cards)


    //Widgets & Variables
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1-  Create main Cards
        InitiateMainCards();
        //this method will declare and instantiate and add the data needed for these cards.
    }

    private void InitiateMainCards(){
        //This method for primary cards
        recyclerView = findViewById(R.id.recyclerViewChapters);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,
                false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }
}