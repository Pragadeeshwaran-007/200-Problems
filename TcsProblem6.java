import java.util.*;
public class TcsProblem6 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s1.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i< n ;i++){
            arr[i] = s1.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = s1.nextInt();
        k = k%n;
        System.out.println("Before rotating");
        System.out.println(Arrays.toString(arr));
        rotateArray(arr , k);
        System.out.println("After rotating");
        System.out.println(Arrays.toString(arr));

    }

    public static  void rotateArray(int[] arr , int k){
        int n = arr.length;
        reverseArray(arr , 0 ,n-1);
        reverseArray(arr , 0,k-1);
        reverseArray(arr, k, n-1);
    }

    public static  void reverseArray(int[] arr , int start , int end){
        while(start < end ){
            swap(arr , start , end);
            start++;
            end--;
        }

    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
