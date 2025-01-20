package Queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(6);
        queue.insert(111);
        queue.insert(2);
        queue.insert(11);
        queue.insert(75);
        queue.insert(21);
        queue.display();


    }
}
