package com.example.logicaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Antwoorden

    private EditText mInputTF;
    private EditText mInputFT;
    private EditText mInputFF;
    private EditText mInputTT;
    private Button mSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mInputFF = findViewById(R.id.inputFF);
        mInputFT = findViewById(R.id.inputFT);
        mInputTT = findViewById(R.id.inputTT);
        mInputTF = findViewById(R.id.inputTF);
        mSubmit = findViewById(R.id.mSubmit);


    }
    //Checkt de antwoorden

    public void checkAwnser(View v) {

        boolean solution = true;

        if (!mInputFF.getText().toString().toUpperCase().equals(getString(R.string.F))) {
            solution = false; }
        if (!mInputTF.getText().toString().toUpperCase().equals(getString(R.string.F))) {
            solution = false; }
        if (!mInputFT.getText().toString().toUpperCase().equals(getString(R.string.F))) {
            solution = false; }
        if (!mInputTT.getText().toString().toUpperCase().equals(getString(R.string.T))) {
            solution = false; }

        if (solution) {
            answerCorrect();
        } else {
            answerIncorrect();
        }

    }

    //Reset de inputs

    private void resetInput() {

        mInputTF.setText("");
        mInputFT.setText("");
        mInputFF.setText("");
        mInputTT.setText("");

    }
    //Geeft een message als het antwoord goed is en reset de input.

    private void answerCorrect() {

        Toast.makeText(this, getString(R.string.Prima), Toast.LENGTH_SHORT).show();
        resetInput();

    }

    //Geeft een message als het antwoord fout is en reset de input.

    private void answerIncorrect() {

        Toast.makeText(this, getString(R.string.Fout), Toast.LENGTH_SHORT).show();
        resetInput();

    }
}

