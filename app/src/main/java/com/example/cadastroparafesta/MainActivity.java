package com.example.cadastroparafesta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nome = findViewById(R.id.nome);
        EditText idade = findViewById(R.id.Idade);
        RadioButton masculino = findViewById(R.id.masculino);
        RadioButton feminino = findViewById(R.id.feminino);
        Button btn = findViewById(R.id.btn);
        TextView resultado = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sexo = " ";

                if(masculino.isChecked())
                {
                    sexo = masculino.getText().toString();
                }
                else
                {
                    sexo = "Feminino";
                }

                if(Integer.parseInt(idade.getText().toString()) >= 18)
                {
                    resultado.setText("Nome: " + nome.getText().toString() + "\nIdade: " + idade.getText().toString() + "\nSexo: " + sexo + "\n\n Você pode participar da festa!");
                }
                else
                {
                    resultado.setText("Nome: " + nome.getText().toString() + "\nIdade: " + idade.getText().toString() + "\nSexo: " + sexo + "\n\n Você não pode participar da festa!");
                }

                }

            });
        };

    }