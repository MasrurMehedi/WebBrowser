package com.example.masror_mehedi.webbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGo,btnFB,btnGoogle,btnOfflinePege;
    EditText etxtURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = findViewById(R.id.btn_go);
        btnFB =findViewById(R.id.btn_fb);
        btnGoogle = findViewById(R.id.btn_google);
        etxtURL = findViewById(R.id.etxt_url);
        btnOfflinePege = findViewById(R.id.btn_offline_page);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = etxtURL.getText().toString();
                if (url.isEmpty())
                {

                    Toast.makeText(MainActivity.this,"please enter URL!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);
                }
            }

        });

        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);
            }
        });


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);
            }
        });
        btnOfflinePege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","offline");
                startActivity(intent);
            }
        });

    }
}
