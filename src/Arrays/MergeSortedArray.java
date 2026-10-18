package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter first sorted array: ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }


        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter second sorted array: ");
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n + m];

        int i = 0;          //pointer for arr1
        int j = 0;          //pointer for arr2
        int k = 0;          // pointer for result array


        while(i < n && j < m){                      //Traverse the both array and copy the smallest element
            if(arr1[i] <= arr2[j]){
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n){                               //Copy the remaining element of first array
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j < m){                              //Copy the remaining element of second array
            merged[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
