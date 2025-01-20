package Recursion;

public class Maze {
    public static void main(String[] args) {
        path("", 3,3);
    }

    static int count(int row , int col ){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);
        return left + right;
    }

    static void path(String p , int r , int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + "D" ,r - 1 , c);
        }
        if (c > 1) {
            path(p + 'R',r,c-1);
        }
    }
}
