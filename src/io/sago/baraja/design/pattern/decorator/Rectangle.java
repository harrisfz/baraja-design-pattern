package io.sago.baraja.design.pattern.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resize Rectangle");
    }

    @Override
    public String description() {
        return "Rectangle Object";
    }

    @Override
    public boolean hidden() {
        return false;
    }
}
