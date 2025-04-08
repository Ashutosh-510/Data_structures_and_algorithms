package Multithreading;

public class Mythread extends Thread{

    private Counter counter;

    public Mythread(Counter counter){
        this.counter = counter;
    }
}
