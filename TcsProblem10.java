import java.util.*;

public class TcsProblem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        Set<Integer> set1 = new HashSet<Integer>();
        for (int num : arr1) set1.add(num);

        Set<Integer> set2 = new HashSet<Integer>();
        for (int num : arr2) set2.add(num);

        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

        sc.close();
    }
}
