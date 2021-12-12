package com.example.gaudesoftdemo;

import android.widget.Button;
import android.widget.TextView;
import android.view.View;
public class Calculator {
        private double result = 0;
        public Calculator effacer(){
            this.result = 0;
            return this;
        }
        public Calculator somme(double a, double b){
            this.result = this.result + a + b;
            return this;
        }
        public Calculator fois(double a, double b){
            if(this.result == 0){
                this.result = a * b;
                return this;
            }
            this.result = this.result * a * b;
            return this;
        }
        public Calculator division(double a, double b){
            if(this.result == 0 && b != 0){
                this.result = a / b;
                return this;
            }
            if(a != 0 && b != 0){
                this.result = this.result / a / b;
                return this;
            }
            return this;
        }
        public Calculator moins(double a, double b){
            this.result = this.result - a - b;
            return this;
        }
        public Calculator mod(double a, double b){
            if(this.result == 0 && b != 0){
                this.result = a % b;
                return this;
            }
            if(a != 0 && b != 0){
                this.result = this.result % a % b;
                return this;
            }
            return this;
        }
        public int toInt(){
//Premiere methode
            int result = (int) this.result;
            return result;
        }public double toDouble(){
//Premiere methode
            return this.result;
        }

}
