package com.ahmedco.templatemethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test1();
    }

    private void Test1(){
        //Base class declares algorithm 'placeholders', and derived classes implement the placeholders
        //https://sourcemaking.com/design_patterns/template_method/java/2
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}
