package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElements {
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

            map.put(arr[i], map.getOrDefault(arr[i] ,0) + 1);

            if(map.get(arr[i]) > n/2){
                System.out.print("Majority element: " + arr[i]);
                return;
            }
        }
        System.out.print("No majority");
    }
}
