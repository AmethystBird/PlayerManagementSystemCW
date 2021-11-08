package com.example.playermanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
            TextView inputUsernameOrEmailLabel = findViewById(R.id.inputUsernameOrEmailLabel);
            TextView emailOrUsernamePrompt = findViewById(R.id.emailOrUsernamePrompt);

            TextView inputPasswordLabel = findViewById(R.id.inputPasswordLabel);
            TextView passwordPrompt = findViewById(R.id.passwordPrompt);

            boolean missingFields = false;
            if (inputUsernameOrEmailLabel.getText().toString().isEmpty()) //If the user has left the username or email TextView blank
            {
                emailOrUsernamePrompt.setText("Username or Email required.");
                missingFields = true;
            }
            else if (!emailOrUsernamePrompt.getText().toString().isEmpty()) //If the user has left the username or email TextView blank
            {
                emailOrUsernamePrompt.setText("");
            }
            if (inputPasswordLabel.getText().toString().isEmpty()) //If the user has left the password TextView blank
            {
                passwordPrompt.setText("Password is required.");
                missingFields = true;
            }
            else if (!passwordPrompt.getText().toString().isEmpty()) //If the user has left the username or email TextView blank
            {
                passwordPrompt.setText("");
            }

            if (missingFields == false) //If they have no missing fields
            {
                Intent activityTransition = new Intent(MainActivity.this, Scores.class);
                startActivity(activityTransition);
            }
        }
        else if (view.getId() == R.id.registerOptionButton) //Register option button clicked
        {
            ResetActivity();
            Intent activityTransition = new Intent(MainActivity.this, Register.class);
            startActivity(activityTransition);
        }
    }
    
    public void ResetActivity()
    {
        //Clearing prompts
        TextView inputUsernameOrEmailLabel = findViewById(R.id.inputUsernameOrEmailLabel);
        TextView emailOrUsernamePrompt = findViewById(R.id.emailOrUsernamePrompt);
        TextView inputPasswordLabel = findViewById(R.id.inputPasswordLabel);
        TextView passwordPrompt = findViewById(R.id.passwordPrompt);

        inputUsernameOrEmailLabel.setText("");
        emailOrUsernamePrompt.setText("");
        inputPasswordLabel.setText("");
        passwordPrompt.setText("");
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