package module_5;


    class LifeCycleThread extends Thread {

        public void run() {
            System.out.println("Thread is in Running State");

            try {
                Thread.sleep(1000); // Thread goes to Timed Waiting state
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Thread execution finished");
        }
        public class Thread_Life_Cycle_Demo {
        public static void main(String[] args) {

            LifeCycleThread t1 = new LifeCycleThread();

            System.out.println("State after creation: " + t1.getState());

            t1.start();
            System.out.println("State after start(): " + t1.getState());

            try {
                Thread.sleep(100);
                System.out.println("State during execution: " + t1.getState());

                t1.join();
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("State after completion: " + t1.getState());
        }
    }
}
