package com.cookandroid.capstone1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceSate) {

        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_second);

        button1 = (Button)findViewById(R.id.btn1);
        button2 = (Button)findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //카메라
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //갤러리
                Uri uri = Uri.parse("content://media/external/images/media");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivity(intent);
            }
        });
    }
}
