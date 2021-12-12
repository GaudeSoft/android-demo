package com.example.gaudesoftdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculatrice extends AppCompatActivity implements View.OnClickListener{

    Button buttonAC;
    Button buttonUn;
    Button buttonDeux;
    Button buttonTrois;
    Button buttonQuatre;
    Button buttonCinq;
    Button buttonSix;
    Button buttonSept;
    Button buttonHuit;
    Button buttonNeuf;
    Button buttonPlus;
    Button buttonPlusMoins;
    Button buttonPourcent;
    Button buttonMoins;
    Button buttonDiv;
    Button buttonFois;
    Button buttonZero;
    Button buttonEgale;
    Button buttonVirgule;
    TextView ecran;

    private double val1 = 0;

    private double val2 = 0;
    private String operation = "";
    private  boolean isOp1 = true;
    private boolean dec = false;
    private boolean cal = false;
    private double dec1 = 0.0;
    private double dec2 = 0.0;
    private double resultat;
    View.OnClickListener ajouterChiffreListener;
    Calculator calc;

    private double chiffre1;
    private boolean clicOperateur = false;
    Calculator ne = new Calculator();

    public static  String chiffreClick(String str){return str;}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        View view = null;
        calc = new Calculator();
        ecran = findViewById(R.id.screen);

        buttonAC = findViewById(R.id.buttonAC);
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                effacer();
                calc.effacer();
            }
        });

        buttonEgale = findViewById(R.id.buttonEgale);
        buttonEgale.setOnClickListener(this);
//Methode 3
        ajouterChiffreListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ajouterChiffre(view);
            }
        };
        buttonCinq = findViewById(R.id.buttonCinq);
        buttonCinq.setOnClickListener(ajouterChiffreListener);
        buttonHuit = findViewById(R.id.buttonHuit);
        buttonHuit.setOnClickListener(ajouterChiffreListener);
    }
    private void afficher(){
        if(!isOp1){ ecran.setText(String.valueOf(val1) +" "+operation+" "+String.valueOf(val2)); }
            else{
                if(cal == true){
                    ecran.setText( String.valueOf(resultat) );
                }else{
                    ecran.setText( String.valueOf(val1) );
                }
            }
        }

    public void setOperation(View v) {
        switch (v.getId()) {
            case R.id.buttonPlus:
                operation = "+";
                break;
            case R.id.buttonMoins:
                operation = "-";
                break;
            case R.id.buttonFois:
                operation = "*";
                break;
            case R.id.buttonDivision:
                operation = "/";
                break;
            case R.id.buttonPourcentage:
                operation = "%";
                break;
            default:
                return;
        }
        isOp1 = false;
        afficher();
    }
    public void ajouterChiffre(View v){
        int val = Integer.parseInt(((Button)v).getText().toString());
        if(!isOp1){
            val2 = val2 * 10 + val;
            afficher();
        }else {
            val1 = val1 * 10 + val;
            afficher();
        }
    }
    public void calculer(View view){
        if(!isOp1){
            switch (operation){
                case "+" : resultat = this.calc.somme(val1,val2).toDouble(); break;
                case "-" : resultat = this.calc.moins(val1,val2).toDouble(); break;
                case "*" : resultat = this.calc.fois(val1,val2).toDouble(); break;
                case "/" : resultat = this.calc.division(val1,val2).toDouble(); break;
                case "%" : resultat = this.calc.mod(val1,val2).toDouble(); break;
                default: return;
            }
            val2 = 0;
            cal = true;
            isOp1 = true;
            afficher();
        }
    }
    public void effacer(){
        val1 = 0;
        val2 = 0;
        operation = "";
        isOp1 = true;
        resultat = 0;
        cal = false;
        this.calc.effacer();
        afficher();
    }


    //
//
//
//
//
    public void ValDecimal(View view){
        if(dec == false){
            if(isOp1){
                dec1 = val1 * 10 + (double)(val1/10);
            } else {
                dec2 = val2 * 10 + (double)(val2/10);
            }
        }
        dec = true;
        afficher();
    }
    public void plusMoins(View view){
        if(isOp1){
            val1 = val1 * (-1);
        }else{val2 = val2 * (-1);}
        afficher();
    }
    @Override
    public void onClick(View view) {
        calculer(view);
    }
}