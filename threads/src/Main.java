// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        //System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("mainnn");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
        myThread1.start();
        System.out.println(myThread1.isAlive());
        
    }
}