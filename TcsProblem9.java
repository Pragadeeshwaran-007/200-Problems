import java.util.*;

public class TcsProblem9 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s1.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] arr2 = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            arr2[idx++] = num;
        }

        System.out.println(Arrays.toString(arr2));
        s1.close();
    }
}
