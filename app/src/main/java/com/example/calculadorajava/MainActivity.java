package com.example.calculadorajava;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private double num1 = 0;
    private double num2 = 0;
    private String operador = "";
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResutado);

        // Botón de número 1
        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(v -> agregarNumero("1"));

        // Botón de número 2
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(v -> agregarNumero("2"));

        // Botón de número 3
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(v -> agregarNumero("3"));

        // Botón de número 4
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(v -> agregarNumero("4"));

        // Botón de número 5
        Button btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(v -> agregarNumero("5"));

        // Botón de número 6
        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(v -> agregarNumero("6"));

        // Botón de número 7
        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(v -> agregarNumero("7"));

        // Botón de número 8
        Button btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(v -> agregarNumero("8"));

        // Botón de número 9
        Button btn9 = findViewById(R.id.button9);
        btn9.setOnClickListener(v -> agregarNumero("9"));


        // Operadores

        // Botón de suma
        Button btnSumar = findViewById(R.id.buttonSumar);
        btnSumar.setOnClickListener(v -> {
            operador = "+";
            num1 = Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText("0");
        });

        // Botón de resta
        Button btnRestar = findViewById(R.id.buttonRestar);
        btnRestar.setOnClickListener(v -> {
            operador = "-";
            num1 = Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText("0");
        });

        // Botón de multiplicacion
        Button btnMulti = findViewById(R.id.buttonMultiplicar);
        btnMulti.setOnClickListener(v -> {
            operador = "*";
            num1 = Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText("0");
        });

        // Botón de divison
        Button btnDividir = findViewById(R.id.buttonDividir);
        btnDividir.setOnClickListener(v -> {
            operador = "/";
            num1 = Double.parseDouble(tvResultado.getText().toString());
            tvResultado.setText("0");
        });

        Button btnResultados = findViewById(R.id.buttonResultados);
        btnResultados.setOnClickListener(v -> {

            num2 = Double.parseDouble(tvResultado.getText().toString());
            Operacion operacion = null;


            switch (operador) {
                case "+":
                    operacion = new Suma(num1, num2);
                    break;
                case "-":
                    operacion = new Resta(num1, num2);
                    break;
                case "*":
                    operacion = new Multiplicacion(num1, num2);
                    break;
                case "/":
                    operacion = new Division(num1, num2);
                    break;
            }

            // Validación de operacion
            if (operacion != null) {
                try {
                    double resultado = operacion.calcular();
                    tvResultado.setText(String.valueOf(resultado)); // Resultado
                    // Resetear
                    num1 = resultado;
                    operador = "";
                    num2 = 0;
                } catch (ArithmeticException e) {
                    tvResultado.setText("Error");
                }
            }
        });

        // Botoncillo para limpiar
        Button btnLimpiar = findViewById(R.id.buttonLimpiar);
        btnLimpiar.setOnClickListener(v -> {
            num1 = 0;
            num2 = 0;
            operador = "";
            tvResultado.setText("0");
        });
    }

    // Método para agregar los num de los botones
    private void agregarNumero(String numero) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText(numero);
        } else {
            tvResultado.setText(tvResultado.getText().toString() + numero);
        }
    }
}