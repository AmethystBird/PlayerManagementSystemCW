package com.example.playermanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //Button generated activity transitions
    public void ActivityTransition(View view)
    {
        if (view.getId() == R.id.registerButton) //Login button clicked
        {
            Intent activityTransition = new Intent(Register.this, Scores.class);
            startActivity(activityTransition);
        }
        else if (view.getId() == R.id.loginOptionButton) //Register option button clicked
        {
            Intent activityTransition = new Intent(Register.this, MainActivity.class);
            startActivity(activityTransition);
        }
    }
}