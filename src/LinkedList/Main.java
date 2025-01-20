package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(6);
        list.insertFirst(23);
        list.insertFirst(11);


        //list.Display();
        list.delete(6);
        list.Display();

    }
}
