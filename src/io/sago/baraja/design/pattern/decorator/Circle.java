package io.sago.baraja.design.pattern.decorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resize Circle");
    }

    @Override
    public String description() {
        return "Circle Object";
    }

    @Override
    public boolean hidden() {
        return false;
    }
}
