package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figure = new ArrayList<Shape>();

    public List<Shape> getFigureList() {
        return figure;
    }

    public void addFigure(Shape shape) {
        figure.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return figure.remove(shape);
    }

    public Shape getFigure(int n) {
        if(n < figure.size() && n >= 0) {
            return figure.get(n);
        } else {
            return null;
        }
    }

    public void showFigures() {
        System.out.println(figure.toString());
    }
}
