package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 4);
        Complex c2 = new Complex(3, 5);
        Complex c3 = c1.add(c2);
        Complex c4 = c1.mul(c2);
        System.out.println(c3.toString());
        System.out.println(c4.toString());
    }
}
