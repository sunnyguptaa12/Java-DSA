package Arrays;

import java.util.Scanner;

public class CheckArrayisSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Size: ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 1; i < n; i++){
           if( arr[i] < arr[i - 1]){
               isSorted = false;
               break;
           }
        }
        if(isSorted){
            System.out.print("Array is sorted");
        }else {
            System.out.print("Array is not sorted");
        }
    }
}
