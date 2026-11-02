package BinarySearch;

public class MinimumRotatedSortedArray {
    public static int findMin(int[] arr){

        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[high]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 2};
        System.out.println(findMin(arr));
    }
}
