package com.example.biodata;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSave;
    EditText edtName, edtChapter, edtJml;
    TextView tvName, tvChapter, tvPrice, tvJml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = findViewById(R.id.btn_save);
        edtName = findViewById(R.id.edt_name);
        edtChapter = findViewById(R.id.edt_chapter);
        edtJml = findViewById(R.id.edt_jml);
        tvName = findViewById(R.id.tv_result_name);
        tvChapter = findViewById(R.id.tv_result_chapter);
        tvJml = findViewById(R.id.tv_result_jml);
        tvPrice = findViewById(R.id.tv_result_price);
        btnSave.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_save) {
            String name = edtName.getText().toString();
            String chapter = edtChapter.getText().toString();
            String jml = edtJml.getText().toString();
            if (name.isEmpty() || chapter.isEmpty() || jml.isEmpty()) {
                edtName.setError("Tidak Boleh ada field Kosong");
                edtChapter.setError("Tidak Boleh ada field Kosong");
                edtJml.setError("Tidak Boleh ada field Kosong");
            }else {
                int price = 2000 * Integer.parseInt(jml);
                tvName.setText("Name " + name);
                tvChapter.setText("Chapter " + chapter);
                tvJml.setText("Jumlah Pembelian "+jml);
                tvPrice.setText("Harga " + price);
            }
        }
    }
}
