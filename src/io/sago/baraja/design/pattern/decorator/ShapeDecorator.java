package io.sago.baraja.design.pattern.decorator;

public abstract class ShapeDecorator implements Shape {

    Shape decorated;

    public ShapeDecorator(Shape decorated) {
        this.decorated = decorated;
    }
}
