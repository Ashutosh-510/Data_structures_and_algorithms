package Multithreading;



public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Mythread t1 = new Mythread(counter);

    }
}
