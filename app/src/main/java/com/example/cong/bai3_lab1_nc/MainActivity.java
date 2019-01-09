package com.example.cong.bai3_lab1_nc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnDem;
    private EditText txtNhap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDem = (Button) findViewById(R.id.btnDem);
        txtNhap = (EditText) findViewById(R.id.txtNhap);
        btnDem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nd =txtNhap.getText().toString();
                char kyTu='a';
                int count=0;
                for(int i=0;i<nd.length();i++){
                    if(nd.charAt(i)==kyTu){
                        count++;
                    }
                }
                Toast.makeText(MainActivity.this," Số lượng ký tự  "+kyTu+" là"+count,Toast.LENGTH_SHORT).show();


            }
        });

    }
}
