package com.example.user.firstapp1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i = 1;


    public void clickFunction(View view){

        EditText nameEditText = (EditText)findViewById(R.id.nameEditText);

        ImageView image = (ImageView)findViewById(R.id.catImageView);


        image.setImageResource(R.drawable.cat2);
        TextView tvName = (TextView)findViewById(R.id.tvName);
        tvName.setText("Your name is " + nameEditText.getText().toString());
        Toast.makeText(this,"You have typed " + tvName.getText().toString(),Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
