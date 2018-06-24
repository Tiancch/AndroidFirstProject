package com.example.user.firstapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity3 extends AppCompatActivity {

    Button btnBackToMain;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnBackToMain = findViewById(R.id.btnBacktoMain);
        imageView = findViewById(R.id.imageView);
        setContentView(R.layout.activity_3);

        btnBackToMain.setOnClickListener(new View.OnClickListener() {

                                             @Override
                                             public void onClick(View v) {
                                                 imageView.setImageResource(R.drawable.cat1);
                                                 Intent intent = new Intent(Activity3.this, MainActivity.class);
                                                 startActivity(intent);

                                             }
                                         }
        );
    }

}
