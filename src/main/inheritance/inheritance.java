package main.inheritance;

public class inheritance {

    static class Shape {
        private String color;

        public Shape(String color) {
            this.color = color;
        }

        public void draw() {
            System.out.println("Drawing a " + color + " shape.");
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Square extends Shape {
        private double sideLength;

        public Square(String color, double sideLength) {
            super(color);
            this.sideLength = sideLength;
        }

        public double getSideLength() {
            return sideLength;
        }

        public double getArea() {
            return sideLength * sideLength;
        }
    }


        public static void main(String[] args) {
            Circle circle = new Circle("Red", 5.0);
            Square square = new Square("Blue", 4.0);

            circle.draw();
            System.out.println("Circle Area: " + circle.getArea());
            square.draw();
            System.out.println("Square Area: " + square.getArea());
        }






}
