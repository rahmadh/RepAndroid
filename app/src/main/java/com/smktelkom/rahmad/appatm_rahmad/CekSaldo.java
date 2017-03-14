package com.smktelkom.rahmad.appatm_rahmad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CekSaldo extends AppCompatActivity {
    Button btnBack;
    TextView txtSaldo;
    int saldo = 100000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_saldo);

        btnBack = (Button)findViewById(R.id.btnBack);
        txtSaldo = (TextView)findViewById(R.id.txtSaldo);

        txtSaldo.setText("Rp "+saldo);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(CekSaldo.this, pilihanbank.class);
                startActivity(i);
            }
        });
    }
}
