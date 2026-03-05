package module_5;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class Thread_Demo {

        public static void main(String[] args) {


            MyThread t1 = new MyThread();
            t1.start();
            MyRunnable r = new MyRunnable();
            Thread t2 = new Thread(r);
            t2.start();
        }
    }

