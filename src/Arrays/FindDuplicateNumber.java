package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicates number: " + arr[i]);
                found = true;
                break;
            }
            set.add(arr[i]);
        }
        if(!found){
            System.out.println("No duplicate found");
        }
    }
}
