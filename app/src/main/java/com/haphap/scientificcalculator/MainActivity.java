package com.haphap.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etAngka;
    TextView tvHasil;
    Button btnSin, btnCos, btnTan, btnCsc, btnSec, btnCot, btnLog;

    DecimalFormat df = new DecimalFormat("###.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka = findViewById(R.id.et_angka);
        tvHasil = findViewById(R.id.tv_hasil);
        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnCsc = findViewById(R.id.btn_csc);
        btnSec = findViewById(R.id.btn_sec);
        btnCot = findViewById(R.id.btn_cot);
        btnLog = findViewById(R.id.btn_log);



        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double sin = Math.sin(Math.toRadians(angka));
                    
                    tvHasil.setText(df.format(sin));
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double cos = Math.cos(Math.toRadians(angka));

                    tvHasil.setText(df.format(cos));
                }catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double tan = Math.tan(Math.toRadians(angka));

                    tvHasil.setText(df.format(tan));
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double csc = 1/Math.sin(Math.toRadians(angka));

                    tvHasil.setText(df.format(csc));
                }catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double sec = 1/Math.cos(Math.toRadians(angka));

                    tvHasil.setText(df.format(sec));
                }catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double cot = 1/Math.tan(Math.toRadians(angka));

                    tvHasil.setText(df.format(cot));
                }catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double angka = Double.valueOf(etAngka.getText().toString().trim());
                    double log10 = Math.log10(angka);

                    tvHasil.setText(df.format(log10));
                }catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
