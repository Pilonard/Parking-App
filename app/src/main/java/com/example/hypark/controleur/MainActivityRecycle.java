package com.example.hypark.controleur;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.hypark.R;
import com.example.hypark.vue.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivityRecycle extends AppCompatActivity {

    private static final String TAG = "MainActivityRecycle";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycle);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("R.drawable/park");
        mNames.add("Havasu Falls");

        mImageUrls.add("R.drawable/parkGare");
        mNames.add("Trondheim");

        mImageUrls.add("R.drawable/parkGare");
        mNames.add("Portugal");

        mImageUrls.add("R.drawable/parkGare");
        mNames.add("Rocky Mountain National Park");


        mImageUrls.add("R.drawable/parkGare");
        mNames.add("Mahahual");

        mImageUrls.add("R.drawable/parkGare");
        mNames.add("Frozen Lake");


        mImageUrls.add("R.drawable/parkGare");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.Recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
