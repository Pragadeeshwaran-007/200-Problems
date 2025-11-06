import java.util.*;
public class TcsProblem5 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s1.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i< n ;i++){
            arr[i] = s1.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum =0 ;
        for(int num : arr){
            sum += num;
        }
        float avg = (float) sum /n;

        System.out.printf("The avg of elements in the array is %.2f\n", avg);
    }
}
