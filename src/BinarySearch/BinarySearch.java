package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 70;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){

            int mid = low + (high - low) / 2;                       //Find Middle

            if(arr[mid] == target){
                System.out.println("found at index: " + mid);
                return;

            } else if(arr[mid] < target){
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        System.out.println("element not found");
    }
}
