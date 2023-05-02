package com.company.implicit_explicitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // this is Explicit Intent it will have to work around your app only for moving activity
                // and downloading document in background from the app..
                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra("id",1000);
                startActivity(i);
            }
        });



    }
}