package Recursion.Basic;

public class powOf2 {
    public static void main(String[] args) {
        System.out.println(pow2(4));
    }

    public static int pow2(int n){
        if(n == 1){
            return 2;
        }

        return 2 * pow2(n-1);
    }
}
