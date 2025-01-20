import java.sql.SQLOutput;
import java.util.Arrays;
// fn calling itself is called recursion
//It helps us in solving bigger/Complex problems in a simpler way
// You can convert recursion solution into iteration and vice versa
// Space Complexity is not constant because of recursive calls
public class Main {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        // Base Condition
        if (n == 5){
            System.out.print(n);
            return;
        }
        // our repeating fn
        System.out.print(n+" ");
        print(n+1);
    }
}