package io.sago.baraja.design.pattern.decorator;

public interface Shape {
    void draw();

    void resize();

    String description();

    boolean hidden();
}
