package com.example.gaudesoftdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatrice extends AppCompatActivity {
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


    double chiffre=0;
    boolean update=false;
    boolean clickoperateur=false;
    public  String operateur="";
    double value1,value2;
    boolean crunPlus,crunMul,crunMoin,crunDiv,crunMod;

    private double chiffre1;
    private boolean clicOperateur = false;


    public static  String chiffreClick(String str){return str;}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonPlusMoins = (Button) findViewById(R.id.buttonPlusMoins);
        buttonPourcent = (Button) findViewById(R.id.buttonPourcentage);
        buttonDiv = (Button) findViewById(R.id.buttonDivision);
        buttonSept = (Button) findViewById(R.id.buttonSept);
        buttonHuit = (Button) findViewById(R.id.buttonHuit);
        buttonNeuf = (Button) findViewById(R.id.buttonNeuf);
        buttonFois = (Button) findViewById(R.id.buttonFois);
        buttonQuatre = (Button) findViewById(R.id.buttonQuatre);
        buttonCinq = (Button) findViewById(R.id.buttonCinq);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonMoins = (Button) findViewById(R.id.buttonMoins);
        buttonUn = (Button) findViewById(R.id.buttonUn);
        buttonDeux = (Button) findViewById(R.id.buttonDeux);
        buttonTrois = (Button) findViewById(R.id.buttonTrois);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonVirgule = (Button) findViewById(R.id.buttonVirgule);
        buttonEgale = (Button) findViewById(R.id.buttonEgale);
        ecran = (TextView) findViewById(R.id.affichageCalculator);

        buttonAC.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        ecran.setText(String.valueOf("0"));
                        return false;
                    }
                }
        );
        buttonAC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var = ecran.getText().toString();
                if (var != null && var.length() > 0) {
                    var = var.substring(0, var.length() - 1);
                    ecran.setText(String.valueOf(var));
                } else {
                    ecran.setText(String.valueOf(""));
                }

            }
        });

        buttonMoins.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(ecran.getText()+"");
                        crunMoin=true;
                        ecran.setText(null);
                    }
                }
        );
        buttonFois.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(ecran.getText()+"");
                        crunMul=true;
                        ecran.setText(null);
                    }
                }
        );
        buttonDiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(ecran.getText()+"");
                        crunDiv=true;
                        ecran.setText(null);
                    }
                }
        );
        buttonPourcent.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.valueOf(ecran.getText().toString()).doubleValue();
                        double value=value1*0.01;
                        ecran.setText(String.valueOf(value));
                    }
                }
        );
        buttonEgale.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value2=Double.parseDouble(ecran.getText()+"");
                        if(crunPlus==true){
                            ecran.setText(value1+value2+"");
                            crunMul=false;
                        }
                        if(crunMoin==true){
                            ecran.setText(value1-value2+"");
                            crunMoin=false;
                        }
                        if(crunMul==true){
                            ecran.setText(value1*value2+"");
                            crunMul=false;
                        }
                        if(crunDiv==true){
                            ecran.setText(value1/value2+"");
                            crunMul=false;
                        }


                    }
                }
        );
    

        buttonVirgule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick(".");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }

            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("0");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });

        buttonUn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("1");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });

        buttonDeux.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("2");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonTrois.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("3");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonQuatre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("4");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonCinq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("5");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("6");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonSept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("7");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonHuit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("8");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
        buttonNeuf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var=chiffreClick("9");
                String val=ecran.getText().toString();
                if(val==""){
                    ecran.setText(String.valueOf(var));
                }else{
                    ecran.setText(String.valueOf(val+var));
                }
            }
        });
    }
        //Fonction plus

        /*public void plusClick(){
            if (clicOperateur){
                calcul();
                ecran.setText(String.valueOf(chiffre1));
            }else {
                chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
                clicOperateur = true;
            }
            operateur = "+";
            update = true;
        }


        public void moinsClick(){
            if (clicOperateur){
                calcul();
                ecran.setText(String.valueOf(chiffre1));
            }else {
                chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
                clicOperateur = true;            }
            operateur = "-";
            update = true;
        }


        public void foisClick(){
            if (clicOperateur){
                calcul();
                ecran.setText(String.valueOf(chiffre1));
            }else {
                chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
                clicOperateur = true;
            }
            operateur = "*";
            update = true;
        }



        public void divClick(){
            if (clicOperateur){
                calcul();
                ecran.setText(String.valueOf(chiffre1));
            }else {
                chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
                clicOperateur = true;
            }
            operateur = "/";
            update = true;
        }

        public void egaleClick() {
            calcul ();
            update = true;
            clicOperateur = false;
        }


        public void acClick(){
            if (clicOperateur){
                clicOperateur = false;
                update = true;
                chiffre1 = 0;
                operateur = "";
                ecran.setText("");
            }else {
                chiffre1 = Double.valueOf(ecran.getText().toString()).doublcliOperateur = true;
            }
            operateur = "";
            ecran.setText("");
        }
*/
        //methode pour faire le calcul
        private void calcul () {
            if (operateur.equals("+")){
                chiffre1 = chiffre1 + Double.valueOf(ecran. getText (). toString ()).doubleValue();
                ecran.setText(String.valueOf (chiffre1));
            }
            if (operateur.equals("-")){
                chiffre1 = chiffre1 - Double.valueOf(ecran. getText (). toString ()).doubleValue();
                ecran.setText(String.valueOf (chiffre1));
            }
            if (operateur.equals("*")){
                chiffre1 = chiffre1 * Double.valueOf (ecran. getText (). toString ()). doubleValue();
                ecran.setText(String.valueOf (chiffre1));
            }
        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(ecran.getText().toString()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                ecran. setText ("0");
            }
        }
        }

}