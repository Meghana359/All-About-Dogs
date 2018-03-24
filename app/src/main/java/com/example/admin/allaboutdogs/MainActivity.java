package com.example.admin.allaboutdogs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Intent to transfer the control from first page to second page
     */
    public void enter_button(View view) {
        Intent i = new Intent(this, questions.class);
        startActivity(i);
    }
}
