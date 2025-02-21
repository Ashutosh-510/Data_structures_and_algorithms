package Recursion.Basic;

public class factorial {
    public static void main(String[] args) {
        int answer = fact(5);
        System.out.println(answer);
    }

    public static int fact(int n){
        // In base case return should be mandatory
        if(n == 1){

            return  n;
        }
        System.out.println(n);

        //Recursive relation
        return n * fact( n - 1);
    }
}
