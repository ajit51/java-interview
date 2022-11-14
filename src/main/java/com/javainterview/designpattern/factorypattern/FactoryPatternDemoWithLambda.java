package com.javainterview.designpattern.factorypattern;

import java.util.function.Supplier;

public class FactoryPatternDemoWithLambda {

    public static void main(String[] args) {

        Supplier<ShapeFactoryWithLambda> factory =  ShapeFactoryWithLambda::new;

        // get an object of Circle and call its draw method.
        Shape shape1 = factory.get().getShape(ShapeType.CIRCLE);
        // call draw method of Circle
        shape1.draw();

        // get an object of Rectangle and call its draw method.
        Shape shape2 = factory.get().getShape(ShapeType.RECTANGLE);
        shape2.draw();
    }
}
