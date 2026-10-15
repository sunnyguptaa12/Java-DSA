package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter array element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int j = 0;      //track position of non zero element

        for(int i = 0; i < n; i++){

            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}
