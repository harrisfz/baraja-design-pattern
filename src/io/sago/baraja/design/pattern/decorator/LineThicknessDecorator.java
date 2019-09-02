package io.sago.baraja.design.pattern.decorator;

public class LineThicknessDecorator extends ShapeDecorator {
    double thickness;

    public LineThicknessDecorator(Shape decorated, double thickness) {
        super(decorated);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decorated.draw();
        System.out.println("Line thickness " + thickness);
    }

    @Override
    public void resize() {
        decorated.resize();
    }

    @Override
    public String description() {
        return decorated.description() + "drawn with " + thickness + "thickness";
    }

    @Override
    public boolean hidden() {
        return false;
    }
}
