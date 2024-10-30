package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point CreatePoint(int x, int y){
        return new Point(x,y);
    }

    void flip() {
        int tmp = x;
        x = y * -1;
        y = tmp * -1;
    }

    //Возникшая проблема: для обозначения дистанции между 2 точками требуется 2 точки, но тест требует
    //использовать только 1 вызов точки???
    double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    double distance(Point point){
        return 0;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
