package com.example.gaudesoftdemo;

import android.widget.Button;
import android.widget.TextView;

public class Calculator {
    Button buttonAC,buttonUn,buttonDeux,buttonTrois,buttonQuatre,buttonCinq,buttonSix,buttonSept,buttonHuit,buttonNeuf,buttonPlus,buttonPlusMoins,buttonPourcent,buttonMoins,buttonDiv,buttonFois,buttonZero,buttonEgale,buttonVirgule;
    TextView ecran;


    double chiffre=0;
    boolean update=false;
    boolean clickoperateur=false;
    public  String operateur="";
    double value1,value2;
    boolean crunPlus,crunMul,crunMoin,crunDiv,crunMod;

    private double chiffre1;
    private boolean clicOperateur = false;

    //Getters

    public Button getButtonAC() {
        return buttonAC;
    }
    public Button getButtonUn() {
        return buttonUn;
    }
    public  Button getButtonDeux(){
        return buttonDeux;
    }
    public  Button getButtonTrois(){
        return buttonTrois;
    }
    public  Button getButtonQuatre(){
        return buttonQuatre;
    }
    public  Button getButtonCinq(){
        return buttonCinq;
    }
    public  Button getButtonSix(){
        return buttonSix;
    }
    public  Button getButtonSept(){
        return buttonSept;
    }
    public  Button getButtonHuit(){
        return buttonHuit;
    }
    public  Button getButtonNeuf(){
        return buttonNeuf;
    }
    public  Button getButtonZero(){
        return buttonZero;
    }
    public  Button getButtonPlus(){
        return buttonPlus;
    }
    public  Button getButtonPlusMoins(){
        return buttonPlusMoins;
    }
    public  Button getButtonMoins(){
        return buttonMoins;
    }
    public  Button getButtonFois(){
        return buttonFois;
    }
    public  Button getButtonDiv(){
        return buttonDiv;
    }
    public  Button getButtonPourcent(){
        return buttonPourcent;
    }
    public  Button getButtonEgale(){
        return buttonEgale;
    }
    public  Button getButtonVirgule(){
        return buttonVirgule;
    }

    public TextView getEcran(){
        return ecran;
    }

    //Setters
      public void setButtonAC(Button buttonAC) {
        this.buttonAC = buttonAC;
    }
    public void setButtonUn(Button buttonUn) {
        this.buttonUn = buttonUn;
    }
    public void setButtonDeux(Button buttonDeux) {
        this.buttonDeux = buttonDeux;
    }
    public void setButtonTrois(Button buttonTrois) {
        this.buttonTrois = buttonTrois;
    }
    public void setButtonQuatre(Button buttonQuatre) {
        this.buttonQuatre = buttonQuatre;
    }
    public void setButtonCinq(Button buttonCinq) {
        this.buttonCinq = buttonCinq;
    }
    public void setButtonSix(Button buttonSix) {
        this.buttonSix = buttonSix;
    }
    public void setButtonSept(Button buttonSept) {
        this.buttonSept = buttonSept;
    }
    public void setButtonHuit(Button buttonHuit) {
        this.buttonHuit = buttonHuit;
    }
    public void setButtonNeuf(Button buttonNeuf) {
        this.buttonNeuf = buttonNeuf;
    }
    public void setButtonZero(Button buttonZero) {
        this.buttonZero = buttonZero;
    }

    public void setButtonEgale(Button buttonEgale) {
        this.buttonEgale = buttonEgale;
    }

    public void setButtonPourcent(Button buttonPourcent) {
        this.buttonPourcent = buttonPourcent;
    }
    public void setButtonVirgule(Button buttonVirgule) {
        this.buttonVirgule = buttonVirgule;
    }
    public void setButtonMoins(Button buttonMoins) {
        this.buttonMoins = buttonMoins;
    }
    public void setButtonPlus(Button buttonPlus) {
        this.buttonPlus = buttonPlus;
    }
    public void setButtonDiv(Button buttonDiv) {
        this.buttonDiv = buttonDiv;
    }
    public void setButtonFois(Button buttonFois) {
        this.buttonFois = buttonFois;
    }
    public void setButtonPlusMoins(Button buttonPlusMoins) {
        this.buttonPlusMoins = buttonPlusMoins;
    }
    public void setEcran(TextView ecran){
        this.ecran = ecran;
    }

    public void  recuperID(){

    }
}
