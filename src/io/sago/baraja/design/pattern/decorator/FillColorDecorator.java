package io.sago.baraja.design.pattern.decorator;

public class FillColorDecorator extends ShapeDecorator {
    String color;

    public FillColorDecorator(Shape decorated, String color) {
        super(decorated);
        this.color = color;
    }

    @Override
    public void draw() {
        decorated.draw();
        System.out.println("Filled color: " + color);
    }

    @Override
    public void resize() {
        decorated.resize();
    }

    @Override
    public String description() {
        return decorated.description() + "filled with color: " + color;
    }

    @Override
    public boolean hidden() {
        return decorated.hidden();
    }
}
