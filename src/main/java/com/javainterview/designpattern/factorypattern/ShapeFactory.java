package com.javainterview.designpattern.factorypattern;

public class ShapeFactory {

    // use getShape method to get object of type shape
    public Shape getShape(ShapeType shapeType){

        if (shapeType == null){
            return null;
        }

        if (shapeType.equals(ShapeType.RECTANGLE)){
            return new Rectangle();
        } else if (shapeType.equals(ShapeType.SQUARE)) {
            return new Square();
        } else if (shapeType.equals(ShapeType.CIRCLE)) {
            return new Circle();
        }
        return null;
    }
}
