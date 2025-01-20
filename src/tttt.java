import java.util.*;
public class tttt {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // total elements in array A
            int k = sc.nextInt(); // elements to be selected for array B

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); // Sort the array to easily select the smallest range

            int minDifference = Integer.MAX_VALUE;

            // Check all possible windows of size 'k' in the sorted array
            for (int i = 0; i <= n - k; i++) {
                int difference = arr[i + k - 1] - arr[i];
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }

            System.out.println(minDifference);
        }
    }

