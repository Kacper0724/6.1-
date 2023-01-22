package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shapeName = "Triangle";
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        if (TriangleCondition()) {
            double HalfOfCircuit = HalfOfCircuit();
            return hernos(HalfOfCircuit);
        } else {
            return 0;
        }
    }

    private boolean TriangleCondition(){
        return (a + b > c &&
                a + c > b &&
                b + c > a);
    }

    private double HalfOfCircuit() {
        return (a + b + c) / 2;
    }

    private double hernos(double HalfOfCircuit){
        return Math.sqrt(HalfOfCircuit * (HalfOfCircuit - a) * (HalfOfCircuit - b) * (HalfOfCircuit - c));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.b, b) != 0) return false;
        if (Double.compare(triangle.c, c) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
