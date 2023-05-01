package com.example.milkmantra.customer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.milkmantra.R;

public class customer_edit_profile extends Activity {
    Button register;
    Button Logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_edit_profile);

        register=findViewById(R.id.register);


        Logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), customer_profile.class);
                startActivity(intent);;
            }
        });


    }


    }




