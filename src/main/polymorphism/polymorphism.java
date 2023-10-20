package main.polymorphism;

public class polymorphism {
    interface Shape {
        void draw(); // Abstract method for drawing
        double getArea(); // Abstract method for calculating area
    }

    // Circle class implementing the Shape interface
    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Circle draw.");
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Square class implementing the Shape interface
    static class Square implements Shape {
        private double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public void draw() {
            System.out.println("Square draw.");
        }

        @Override
        public double getArea() {
            return sideLength * sideLength;
        }
    }

    public static void main(String[] args) {
        // Polymorphism example
        Shape circle = new Circle(5.0); // Create a Circle object with radius 5.0
        Shape square = new Square(4.0); // Create a Square object with side length 4.0

        // Draw different shapes and calculate their areas
        drawShape(circle);
        calculateArea(circle);

        drawShape(square);
        calculateArea(square);
    }

    // Method for drawing different shapes using polymorphism
    public static void drawShape(Shape shape) {
        shape.draw();
    }

    // Method for calculating the areas of different shapes using polymorphism
    public static void calculateArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
