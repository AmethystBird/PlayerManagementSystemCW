package com.example.playermanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Scores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
    }

    //Button generated activity transitions
    public void ActivityTransition(View view)
    {
        if (view.getId() == R.id.newScoreButton) //Login button clicked
        {
            Intent activityTransition = new Intent(Scores.this, NewScore.class);
            startActivity(activityTransition);
        }
    }
}