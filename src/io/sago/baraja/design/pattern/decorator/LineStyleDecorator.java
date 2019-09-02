package io.sago.baraja.design.pattern.decorator;

public class LineStyleDecorator extends ShapeDecorator {
    String style;

    public LineStyleDecorator(Shape decorated, String style) {
        super(decorated);
        this.style = style;
    }

    @Override
    public void draw() {
        decorated.draw();
        System.out.println("Line Style " + style);
    }

    @Override
    public void resize() {
        decorated.resize();
    }

    @Override
    public String description() {
        return decorated.description() + " Drawn with " + style + " line style";
    }

    @Override
    public boolean hidden() {
        return decorated.hidden();
    }
}
