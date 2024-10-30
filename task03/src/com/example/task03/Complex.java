package com.example.task03;

public class Complex {
    private int real;
    private int imagin;

    public Complex(int real, int imagin){
        this.real = real;
        this.imagin = imagin;
    }

    void setReal(int real){
        this.real = real;
    }
    void setImagin(int imagin){
        this.imagin = imagin;
    }
    int getReal(){
        return this.real;
    }
    int getImagin(){
        return this.imagin;
    }

    public Complex add(Complex num){
        return new Complex(getReal() + num.getReal(),getImagin() + num.getImagin());
    }

    public Complex mul(Complex num){
        //(a+bi)*(c+di)=ac+adi+cbi-bd
        return new Complex((getReal()*num.getReal())-(getImagin()* num.getImagin()), (getReal()*num.getImagin())+(num.getReal()*getImagin()));
    }

    public String toString(){
        return getReal() + (getImagin() > 0 ? "+" : "") + getImagin() + "i";
    }
}
