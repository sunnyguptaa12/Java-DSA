package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CountFreqOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int num = arr[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nElement frequencies:");
        for(Integer key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
