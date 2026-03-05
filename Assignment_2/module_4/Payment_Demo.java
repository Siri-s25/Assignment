package module_4;
interface Payment {
    void pay(double amount);
}


class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI.");
    }
}
public class Payment_Demo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(5000);

        Payment p2 = new UPIPayment();
        p2.pay(1500);
    }
}