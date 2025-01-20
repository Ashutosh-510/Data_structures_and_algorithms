package Recursion;

public class fibonnacinumbers {
    public static void main(String[] args) {
        System.out.println(fibo(6));

    }
    static int fibo(int N){

        if(N<=2){
            return N;
        }else{
            // When you right the recursion in a formula .It is known as recurance relation
            return fibo(N-1) + fibo(N-2);
        }
    }
}
