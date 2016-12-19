package com.makers.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_satu, btn_dua, btn_tiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_satu = (Button) findViewById(R.id.btnsatu);
        btn_dua = (Button) findViewById(R.id.btndua);
        btn_tiga = (Button) findViewById(R.id.btntiga);

        btn_satu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SatuActivity.class);
                startActivity(intent);
            }
        });

        btn_dua.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DuaActivity.class);
                startActivity(intent);
            }
        });

        btn_tiga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TigaActivity.class);
                startActivity(intent);
            }
        });
    }
}
