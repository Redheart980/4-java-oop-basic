package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 5);
        Point p2 = new Point(10, 10);
        Line l1 = new Line(p1,p2);
        System.out.println(l1.toString());
        Point p3 = new Point(10,8);
        boolean bol = l1.isCollinearLine(p3);
        System.out.println(bol);
    }
}
