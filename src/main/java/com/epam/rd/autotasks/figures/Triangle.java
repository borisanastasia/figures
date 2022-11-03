package com.epam.rd.autotasks.figures;

public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return 0.5 * Math.abs(
                (a.getX() - c.getX()) * (b.getY() - a.getY())
                        -
                        (a.getX() - b.getX()) * (c.getY() - a.getY()));
    }

    public String pointsToString() {
        return String.format("%s%s%s", a, b, c);
    }

    public Point leftmostPoint() {
        Point leftPoint = a;

        for (Point point : new Point[]{b, c}) {
            if (point.getX() < leftPoint.getX()) {
                leftPoint = point;
            }
        }

        return leftPoint;
    }

}