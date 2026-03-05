package module_3;
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class Main_3 {
    public static void main(String[] args) {

        Shape s;   // Reference of parent class

        s = new Circle();
        s.draw();  // Calls Circle's draw()

        s = new Rectangle();
        s.draw();  // Calls Rectangle's draw()
    }
}
