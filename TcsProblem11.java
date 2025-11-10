import java.util.*;

public class TcsProblem11 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s1.nextInt();
        int tar = s1.nextInt();

        System.out.println(linearSearch(arr,tar));
        System.out.println(binarySearch(arr,tar));
    }

    public static int linearSearch(int[] arr ,int tar){
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            if(arr[i] == tar){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int [] arr ,int tar ){
        int n = arr.length;
        int left =0 , right = n-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid] < tar){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }
}
