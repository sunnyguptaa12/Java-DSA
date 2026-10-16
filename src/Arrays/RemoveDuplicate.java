package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter a sorted array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;

        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Array after removing duplicates: ");
        for(int j = 0; j <= i; j++){
            System.out.println(arr[j] + " ");
        }

    }
}
