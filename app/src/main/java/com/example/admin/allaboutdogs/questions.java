package com.example.admin.allaboutdogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class questions extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        /*
            * When "Done!" button is pressed, it is checked whether right options for the questions are selected or not.
            * Using findViewById correct options for questions are referenced.
            * count is increased for every correct option selected.
         */
        Button button = findViewById(R.id.done);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton a1 = findViewById(R.id.o1a);
                if (a1.isChecked())
                    count++;
                RadioButton c2 = findViewById(R.id.o2c);
                if (c2.isChecked())
                    count++;
                RadioButton a3 = findViewById(R.id.o3a);
                if (a3.isChecked())
                    count++;
                /*
                    * Result is displayed as toast.
                    * count is set to 0.
                 */
                Toast.makeText(getBaseContext(), "Your Score:" + count + "/3", Toast.LENGTH_SHORT).show();
                count = 0;
            }
        });
    }
}
