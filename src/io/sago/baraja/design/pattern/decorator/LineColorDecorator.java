package io.sago.baraja.design.pattern.decorator;

public class LineColorDecorator extends ShapeDecorator {
    String color;

    public LineColorDecorator(Shape decorated, String color) {
        super(decorated);
        this.color = color;
    }

    @Override
    public void draw() {
        decorated.draw();
        System.out.println("Line color " + color);
    }

    @Override
    public void resize() {
        decorated.resize();
    }

    @Override
    public String description() {
        return decorated.description() + " drawn with " + color + " line color";
    }

    @Override
    public boolean hidden() {
        return decorated.hidden();
    }
}
