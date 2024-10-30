package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString(){
        return "Point 1 is: " + p1.toString() + " Point 2 is: " + p2.toString();
    }

    public boolean isCollinearLine(Point p){
        if ((p.x-p1.x)*(p2.y-p1.y)-(p2.x- p1.x)*(p.y- p1.y) == 0){
            if (Math.pow((p1.x - p2.x),2) >= (p.x- p1.x)*(p2.x- p.x) && (p.x- p1.x)*(p2.x- p.x) >= 0){
                if(Math.pow((p1.y - p2.y),2) >= (p.y- p1.y)*(p2.y- p.y) && (p.y- p1.y)*(p2.y- p.y) >= 0)
                    return true;
            }
        }
        return false;
    }
}
