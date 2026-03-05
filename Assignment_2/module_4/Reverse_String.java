package module_4;

public class Reverse_String {
        public static void main(String[] args) {

            String str = "Hello World";

            // Create StringBuilder object
            StringBuilder sb = new StringBuilder(str);

            // Reverse the string
            sb.reverse();

            // Print reversed string
            System.out.println("Original String: " + str);
            System.out.println("Reversed String: " + sb);
        }
    }

