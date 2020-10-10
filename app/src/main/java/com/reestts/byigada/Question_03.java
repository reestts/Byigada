package com.reestts.byigada;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question_03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_03);

        Button goToQuestion04_left = (Button) findViewById(R.id.button_question_03_left);
        goToQuestion04_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Question_03.this, Question_04.class);
                    MainActivity.percent = MainActivity.percent + 10;
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

        Button goToQuestion04_right = (Button) findViewById(R.id.button_question_03_right);
        goToQuestion04_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Question_03.this, Question_04.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}