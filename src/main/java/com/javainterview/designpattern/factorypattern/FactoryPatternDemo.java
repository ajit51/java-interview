package com.javainterview.designpattern.factorypattern;

public class FactoryPatternDemo {


    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Rectangle and call its draw method.
        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        // get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        // get an object of Square and call its draw method.

        Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();
    }
}
