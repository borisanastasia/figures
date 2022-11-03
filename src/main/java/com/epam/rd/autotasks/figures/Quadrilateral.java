package com.epam.rd.autotasks.figures;

public class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {
        Triangle triangle1 = new Triangle(a, b, c);
        Triangle triangle2 = new Triangle(a, c, d);
        return triangle1.area() + triangle2.area();
    }

    public String pointsToString() {
        return String.format("%s%s%s%s", a, b, c, d);
    }

    public Point leftmostPoint() {
        Point leftPoint = a;

        for (Point point : new Point[]{b, c, d}) {
            if (point.getX() < leftPoint.getX()) {
                leftPoint = point;
            }
        }

        return leftPoint;
    }

}