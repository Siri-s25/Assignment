package module_4;

 class Garbage_Demo {

        public void finalize() {
            System.out.println("Garbage Collector called");
        }

        public static void main(String[] args) {

            Garbage_Demo obj1 = new Garbage_Demo();
            Garbage_Demo obj2 = new Garbage_Demo();

            // Objects eligible for garbage collection
            obj1 = null;
            obj2 = null;

            // Requesting JVM to run Garbage Collector
            System.gc();
        }
    }

