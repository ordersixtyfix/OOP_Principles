package main.encapsulation;

public class encapsulation {
    public static class Shape {
        private String color;
        private int x;
        private int y;

        public Shape(String color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void draw() {
            System.out.println("Drawing a " + color + " shape at coordinates (" + x + ", " + y + ").");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape("Red", 50, 60);
        Shape square = new Shape("Blue", 30, 40);

        circle.draw();
        square.draw();

        // Encapsulation allows controlled access to the private fields
        circle.setX(70);
        square.setColor("Green");

        System.out.println("Updated circle coordinates: (" + circle.getX() + ", " + circle.getY() + ")");
        System.out.println("Updated square color: " + square.getColor());
    }
}
