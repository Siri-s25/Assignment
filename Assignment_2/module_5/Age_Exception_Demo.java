package module_5;

public class Age_Exception_Demo {
        static void checkAge(int age) {
            if (age < 18) {
                throw new ArithmeticException("Age is less than 18. Not eligible.");
            } else {
                System.out.println("Eligible to vote.");
            }
        }

        public static void main(String[] args) {
            checkAge(16); // change value to test
        }
    }
