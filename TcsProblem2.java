import java.util.*;
public class TcsProblem2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s1.nextInt();
        int[] arr = new int[n];

        for(int i =0 ; i< n ;i++){
            arr[i] = s1.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("The Second Smallest element in the array is "+ arr[1]);
        System.out.println("The Second largest element in the array is "+ arr[n-2]);
    }
}
