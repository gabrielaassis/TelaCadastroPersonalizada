package com.example.leandroassis.telacadastropersonalizada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private TextView txtNome;
    private RadioButton rBtnH, rBtnM;
    private RadioGroup rGrupo;
    private ImageView imvTela;
    private int[] imagens = {R.drawable.mulher,R.drawable.homem};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        txtNome = findViewById(R.id.txtNome);
        rBtnH = findViewById(R.id.rBtnH);
        rBtnM = findViewById(R.id.rBtnM);
        rGrupo = findViewById(R.id.rGrupo1);
        imvTela = findViewById(R.id.imvTela);

        rBtnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNome.setText("Senhora "+edtNome.getText().toString());
                imvTela.setImageResource(imagens[0]);
            }
        });

        rBtnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNome.setText("Senhor "+edtNome.getText().toString());
                imvTela.setImageResource(imagens[1]);
            }
        });
    }
}