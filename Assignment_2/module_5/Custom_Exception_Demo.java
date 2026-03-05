package module_5;
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class Custom_Exception_Demo {
        static void checkNumber(int num) throws MyException {
            if (num < 0) {
                
                throw new MyException("Number cannot be negative");
            } else {
                System.out.println("Number is: " + num);
            }
        }

        public static void main(String[] args) {
            try {
                checkNumber(-5);
            } catch (MyException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
