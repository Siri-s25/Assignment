package module_4;
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
}

public class Final_Demo {
        public static void main(String[] args) {
            final int x = 10;
            System.out.println("Final variable value: " + x);

            Parent obj = new Parent();
            obj.show();

            FinalClass fc = new FinalClass();
            fc.display();
        }
    }

