package com.smktelkom.rahmad.appatm_rahmad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnok,btndel;
    EditText editpassword;
    String password = "";
    String PASSWORD = "1945";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btndel = (Button)findViewById(R.id.btndel);
        btnok = (Button)findViewById(R.id.btnok);
        editpassword = (EditText)findViewById(R.id.editpassword);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password += "0";
                editpassword.setText(password);
            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password += "1";
                editpassword.setText(password);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "2";
                editpassword.setText(password);
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "3";
                editpassword.setText(password);
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "4";
                editpassword.setText(password);
            }

        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "5";
                editpassword.setText(password);
            }

        });

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "6";
                editpassword.setText(password);
            }

        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "7";
                editpassword.setText(password);
            }

        });

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "8";
                editpassword.setText(password);
            }

        });

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password += "9";
                editpassword.setText(password);
            }

        });

        btndel.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                password = "";
                editpassword.setText(password);
            }

        });

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.equals(PASSWORD)) {
                    Intent i = new Intent(MainActivity.this, pilihanbank.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }
}
