package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    static void reverse(int[]arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K: ");
        int k = sc.nextInt();

       k = k % n;

        reverse(arr, 0, n-1);          //reverse whole array
        reverse(arr, 0, k-1);         //reverse first k element
        reverse(arr, k, n-1);              //reverse remaining element

        System.out.print("Rotated array: " + Arrays.toString(arr));
    }
}
