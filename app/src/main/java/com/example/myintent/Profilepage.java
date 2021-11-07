package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profilepage extends AppCompatActivity {

    private Button button ;
    private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);

        button = findViewById(R.id.profilebtn);
        textView = findViewById(R.id.profilepagetext);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String value = bundle.getString("tag");
            textView.setText(value);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profilepage.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}