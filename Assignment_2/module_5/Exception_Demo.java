package module_5;
import java.io.*;
public class Exception_Demo {

        public static void main(String[] args) {

            
            try {
                int a = 10, b = 0;
                int result = a / b; 
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Unchecked Exception: Division by zero");
            }

           
            try {
                FileReader file = new FileReader("test.txt"); 
                BufferedReader br = new BufferedReader(file);
                System.out.println(br.readLine());
            } catch (IOException e) {
                System.out.println("Checked Exception: File not found");
            }
        }
    }

