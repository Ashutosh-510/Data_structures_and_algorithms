package Recursion;

public class Peermutation {
    public static void main(String[] args) {
        String s1 = "ab";
        System.out.println(s1.substring(0));
    }

    /*static void permutation(String p , String up){


        char c = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f =p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f + c + s , up.substring(1));
        }
    }*/
}
