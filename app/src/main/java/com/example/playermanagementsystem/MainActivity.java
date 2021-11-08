package com.example.playermanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Button generated activity transitions
    public void ActivityTransition(View view)
    {
        if (view.getId() == R.id.loginButton) //Login button clicked
        {
            Intent activityTransition = new Intent(MainActivity.this, Scores.class);
            startActivity(activityTransition);
        }
        else if (view.getId() == R.id.registerOptionButton) //Register option button clicked
        {
            Intent activityTransition = new Intent(MainActivity.this, Register.class);
            startActivity(activityTransition);
        }
    }
}

/*
Button testButton = findViewById(R.id.loginButton);
        testButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                System.out.println("Button Clicked");
                testButton.setBackgroundColor(3);
            }
                    });
 */