package com.epam.rd.autotasks.figures;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public String pointsToString() {
        return center.toString();
    }

    @Override
    public String toString() {
        return String.format("%s[%s%s]", getClass().getSimpleName(), pointsToString(), radius);//переопределен метод
    }
    public Point leftmostPoint(){
        return new Point(center.getX() - radius, center.getY());
    }
}
