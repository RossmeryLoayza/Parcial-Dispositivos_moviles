package com.example.applicationparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Preguntas math_quiz = new Preguntas();

    private TextView puntaje;
    private TextView pregunta;
    private RadioButton qut1;
    private RadioButton qut2;
    private RadioButton qut3;
    private Button sig_preg;

    private String respuesta;
    private int puntaje_c = 0;
    private int numpreg_c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        puntaje = (TextView)findViewById(R.id.text_puntaje);
        pregunta = (TextView)findViewById(R.id.textPregunta);

        qut1 = (RadioButton)findViewById(R.id.firstOption);
        qut2 = (RadioButton)findViewById(R.id.secondOption);
        qut3 = (RadioButton)findViewById(R.id.thirdOption);
        sig_preg = (Button)findViewById(R.id.button);

        Act_pregunta();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void Act_puntaje(int p){
        puntaje_c = puntaje_c + p;
        String result = String.valueOf(puntaje_c);
        puntaje.setText(result);
    }

    private void Act_pregunta(){
        pregunta.setText(math_quiz.get_preg(numpreg_c));
        qut1.setText(math_quiz.get_opcion1(numpreg_c));
        qut2.setText(math_quiz.get_opcion1(numpreg_c));
        qut3.setText(math_quiz.get_opcion1(numpreg_c));

        respuesta = math_quiz.get_respuesta_correcta(numpreg_c);
        numpreg_c++;
    }

    public void siguiente(View view){
        if(qut3.getText() == math_quiz.get_respuesta_correcta(numpreg_c) && qut3.isChecked() == true)
        {
            Act_puntaje(3);
            Toast.makeText(this, "correcta",Toast.LENGTH_LONG).show();

        }else if(qut2.getText() == math_quiz.get_respuesta_correcta(numpreg_c) && qut2.isChecked() == true) {
            Act_puntaje(3);
            Toast.makeText(this, "correcta",Toast.LENGTH_LONG).show();
        }
        if(qut1.getText() == math_quiz.get_respuesta_correcta(numpreg_c) && qut3.isChecked() == true)
        {
            Act_puntaje(3);
            Toast.makeText(this, "correcta",Toast.LENGTH_LONG).show();
        }else {
            Act_puntaje(0);
            Toast.makeText(this, "incorrecta",Toast.LENGTH_LONG).show();
        }
        Act_pregunta();
    }
}