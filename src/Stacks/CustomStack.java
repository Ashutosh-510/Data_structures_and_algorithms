package Stacks;

public class CustomStack {
   private int[] data;

   private static int DEFAULT_SIZE = 10;

   public CustomStack(){
       this(DEFAULT_SIZE);
   }
    public CustomStack(int size) {
        this.data = new int[size];

    }
    private int ptr = -1;
    public boolean push(int item){
       data[ptr++] = item;
       return true;
    }
    public int pop(){
        return data[ptr--];
    }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
