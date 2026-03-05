package module_4;
abstract class Shape {
    abstract void area();
}


class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}


class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class Abstract_Shape_Demo {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.area();

        Rectangle r = new Rectangle(4, 6);
        r.area();
    }
}
