import java.util.*;
public class TcsProblem3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s1.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i< n ;i++){
            arr[i] = s1.nextInt();
        }

        int rev[] = new int [n];
        int idx =0;
        for(int i = n-1 ; i>=0 ; i--){
            rev[idx++] = arr[i];
        }

        System.out.println(Arrays.toString(rev));
    }
}
