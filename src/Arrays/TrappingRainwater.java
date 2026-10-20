package Arrays;

import java.util.Scanner;

public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter height: ");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;

        int totalWater = 0;          //total trapped water

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                } else{
                    totalWater = totalWater + leftMax - height[left];
                }
                left++;


            } else {
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    totalWater = totalWater + rightMax - height[right];
                }
                right--;
            }
        }
        System.out.println("Trapped water: " + totalWater);
    }
}
