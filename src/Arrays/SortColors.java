package Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        int low = 0;                         //points to the position where the next 0 should go.
        int mid = 0;                         //points to the current elements we need to check
        int high = arr.length - 1;           //point to the position where the next 2 should go

        while (mid <= high){


            if(arr[mid] == 0){               //when arr[mid] == 0, swap it with the element at [low] position
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;


            }else if(arr[mid] == 1){          //when arr[mid] == 1, move mid forward
                mid++;

            }else{


                int temp = arr[mid];          //when arr[mid] == 2, swap it with element at high position.
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
