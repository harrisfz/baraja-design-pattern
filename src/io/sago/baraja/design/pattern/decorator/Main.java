package io.sago.baraja.design.pattern.decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating Simple Shape Objects...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        System.out.println("Drawing The Simple Shape Objects...");
        rectangle.draw();
        System.out.println();
        circle.draw();
        System.out.println();

        System.out.println("Creating Decorated Circle and rectangle");
        Shape decoratedCircle1 = new LineColorDecorator(new FillColorDecorator(new LineThicknessDecorator(
                new LineStyleDecorator(circle, "dotted"), 2), "red"), "white");
        decoratedCircle1.draw();
        System.out.println();

        Shape decoratedRecrtangle = new LineThicknessDecorator(new LineColorDecorator(rectangle, "dark grey"), 6);
        decoratedRecrtangle.draw();
        System.out.println();
    }
}
