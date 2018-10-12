package com.anik.swiperefreshlayout;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*

 created by Noor Mohammed Anik
 */

public class MainActivity extends AppCompatActivity {


    //declarations
    ArrayList arrayList = new ArrayList();
    SwipeRefreshLayout mSwipeRefreshLayout;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to xml or initializations
        mSwipeRefreshLayout = findViewById(R.id.swipeToRefresh);
        mListView = findViewById(R.id.listView);


        //set color of swipe refresh
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorAccent);

        //add elements to array list
        arrayList.add("Anik");
        arrayList.add("Noor");
        arrayList.add("Rakib");
        arrayList.add("Shahid");
        arrayList.add("Didar");

        //set adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        mListView.setAdapter(adapter);


        //swipe refresh listeners
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuffle();
                //after shuffle id done then swife refresh is off
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }


    //shuffle method
    public void shuffle(){
        Collections.shuffle(arrayList, new Random(System.currentTimeMillis()));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        mListView.setAdapter(adapter);
    }
}