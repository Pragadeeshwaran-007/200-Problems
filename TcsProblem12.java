import java.util.*;

public class TcsProblem12 {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int t = nums[low]; nums[low] = nums[mid]; nums[mid] = t;
                low++; mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                int t = nums[mid]; nums[mid] = nums[high]; nums[high] = t;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i< n ;i++){
            arr[i] = s1.nextInt();
        }
        sortColors(arr);
        System.out.println(java.util.Arrays.toString(arr)); // [0, 0, 1, 1, 2, 2]
    }
}
