package main.abstraction;

public class abstraction {


    interface Shape {
        void draw(); // abstraction of draw method
    }

    // Implement the Shape interface to the Other Classes.
    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle draw.");
        }
    }

    static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Square draw.");
        }
    }


    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
        }

}
