package com.example.mysubmissiontask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Submission> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(SubmissionData.getListData());

        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewSubmissionAdapter cardViewSubmissionAdapter = new CardViewSubmissionAdapter(this);

        cardViewSubmissionAdapter.setListSubmission(list);
        rvCategory.setAdapter(cardViewSubmissionAdapter);
    }
}
