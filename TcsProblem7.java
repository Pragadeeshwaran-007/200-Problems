import java.util.*;
public class TcsProblem7 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s1.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i< n ;i++){
            arr[i] = s1.nextInt();
        }

        int max = arr[0];

        for(int num : arr){
            if(num > max) max = num;
        }
        int [] freq = new int[max+1];

        for(int num : arr){
            freq[num]++;
        }
        System.out.println(Arrays.toString(freq));

    }
}
