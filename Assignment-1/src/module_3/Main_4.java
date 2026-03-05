package module_3;

class Birds {
    void colour() {
        System.out.println("Birds are beautiful");
    }
}

class Parrot extends Birds {
    @Override
    void colour() {
        System.out.println("Parrot is Green");
    }
}
public class Main_4 {
    public static void main(String[] args) {
        Calculator_4 calc = new Calculator_4();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));

        Birds obj = new Parrot();
        obj.colour();
    }
}
