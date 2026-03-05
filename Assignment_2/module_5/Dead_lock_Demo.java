package module_5;
class A {
    synchronized void methodA(B b) {
        System.out.println("Thread 1 locked A");
        try { Thread.sleep(100); } catch (Exception e) {}
        System.out.println("Thread 1 trying to lock B");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread 2 locked B");
        try { Thread.sleep(100); } catch (Exception e) {}
        System.out.println("Thread 2 trying to lock A");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}


    public class Dead_lock_Demo implements Runnable {

        A a = new A();
        B b = new B();

        Dead_lock_Demo() {
            Thread t = new Thread(this);
            t.start();
            a.methodA(b);
        }

        public void run() {
            b.methodB(a);
        }

        public static void main(String[] args) {
            new Dead_lock_Demo();
        }
    }

