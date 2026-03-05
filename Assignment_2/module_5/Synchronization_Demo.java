package module_5;
class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
class My_Thread extends Thread {
    Counter c;

    My_Thread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Synchronization_Demo {
    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();

        My_Thread t1 = new My_Thread(counter);
        My_Thread t2 = new My_Thread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}
