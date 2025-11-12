import java.util.*;
public class TcsProblem14 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i] = s1.nextInt();
        }
        int tar = s1.nextInt();

        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }
    public static int[] twoSum(int [] arr , int tar){
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i]+arr[j] == tar){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
