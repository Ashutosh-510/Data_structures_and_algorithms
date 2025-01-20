package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }


    public class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;

        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }

    }
    public void insertFirst(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public void insertEnd(int data){
        Node new_node = new Node(data);
        if(tail != null){
            tail.next = new_node;
            tail = new_node;

        }
    }

    public void insertElement(int data , int index){

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node new_node = new Node(data , temp.next);
        temp.next = new_node;
        size++;
    }
    public void DeleteFromEnd(){
        Node secondVal = getindex(size - 2);
        tail = secondVal;
        tail.next = null;
    }
    public Node getindex(int index){
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void delete(int index){

        Node prev = getindex(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
    }
    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }


    }


}


