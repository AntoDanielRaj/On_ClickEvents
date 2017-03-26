package com.example.ctadmin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                TextView mytextView = (TextView) findViewById(R.id.textView);
                mytextView.setText("BEACH");
                ImageView imageView = (ImageView) findViewById(R.id.photo_image_view);
                imageView.setImageResource(R.drawable.beach1);

            }
        });
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                TextView mytextView = (TextView) findViewById(R.id.textView);
                mytextView.setText("LION CUB");
                ImageView imageView = (ImageView) findViewById(R.id.photo_image_view);
                imageView.setImageResource(R.drawable.beach);

            }
        });

        Button gotobutton = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {


            }
        });

    }
}
