import java.util.*;
import java.util.Random;

public class A1103314_0512 extends Thread{

    int pork = 5000;
    int beef = 3000;
    int vegetable = 1000;

    int numCustomers;
    int[] dumplingsRemaining;

    public A1103314_0512(int numCustomers) {
        this.numCustomers = numCustomers;
        this.dumplingsRemaining = new int[]{pork, beef, vegetable};
    }

    public void runSimulation() {
        Thread[] customerThreads = new Thread[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            customerThreads[i] = new Thread(new Customer(i));
            customerThreads[i].start();
        }

        for (int i = 0; i < numCustomers; i++) {
            try {
                customerThreads[i].join();
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized boolean sellDumplings(int type, int numDumplings) {
        if (dumplingsRemaining[type] >= numDumplings) {
            dumplingsRemaining[type] -= numDumplings;
            return true;
        } else {
            return false;
        }
    }

    private class Customer implements Runnable {
        private int id;

        public Customer(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            Random rand = new Random();
            int type = rand.nextInt(3);
            int numDumplings = rand.nextInt(41) + 10;

            System.out.printf("顧客 %d 點了 %d %s 水餃\n", id, numDumplings, getTypeName(type));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }

            synchronized (A1103314_0512.this) {
                boolean sold = sellDumplings(type, numDumplings);
                if (sold) {
                    System.out.printf("顧客 %d 點了 %d %s 水餃\n", id, numDumplings, getTypeName(type));
                } else {
                    System.out.printf("顧客 %d 沒辦法點 %d %s 水餃因為已經賣完了\n", id, numDumplings, getTypeName(type));
                }
            }
        }

        public String getTypeName(int type) {
            switch (type) {
                case 0:
                    return "豬肉";
                case 1:
                    return "牛肉";
                case 2:
                    return "蔬菜";
                default:
                    return "";
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("請輸入同時顧客數量:");
        Scanner input= new Scanner(System.in);
        int numCustomers=input.nextInt();
        A1103314_0512 simulator = new A1103314_0512(numCustomers);
        simulator.runSimulation();
    }
}