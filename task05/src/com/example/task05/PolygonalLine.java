package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    //private ArrayList<Point> points = new ArrayList<>();
    private Point[] points = null;

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++){
            Point point = new Point(points[i].getX(),points[i].getY());
            this.points[i] = point;
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        ArrayList<Point> tmp = new ArrayList<>();
        if (points != null)
            for (int i = 0; i < points.length; i++){
               tmp.add(points[i]);
            }
        Point newPoint = new Point(point.getX(), point.getY());
        tmp.add((newPoint));
        points = new Point[tmp.size()];
        for (int i = 0; i < points.length; i++){
            points[i] = tmp.get(i);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0;
        if (points.length <= 1){
            return len;
        }
        for (int i = 0; i < points.length - 1; i++){
            len += points[i].getLength(points[i+1]);
        }
        return len;
    }

}
