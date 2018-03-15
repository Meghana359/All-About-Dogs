package com.example.admin.allaboutdogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Admin on 10-Mar-18.
 */

public class questions extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void result(View view) {

        RadioButton a1 = (RadioButton) findViewById(R.id.A1a);
        if (a1.isChecked())
            count++;
        RadioButton c2 = (RadioButton) findViewById(R.id.A2c);
        if (c2.isChecked())
            count++;
        RadioButton a3 = (RadioButton) findViewById(R.id.A3a);
        if (a3.isChecked())
            count++;
        Toast.makeText(getBaseContext(), "Your Score:" + count + "/3", Toast.LENGTH_SHORT).show();
        count = 0;

    }
}
