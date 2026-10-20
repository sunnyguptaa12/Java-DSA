package Arrays;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights: ");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n -1;

        int maxArea = 0;

        while(left < right){
            int width = right - left;                                             //calculate width
            int currentheight = Math.min(height[left], height[right]);            //take shorter height
            int area = currentheight * width;                                     //find area = current height * width

            if(area > maxArea){
                maxArea = area;
            }


            //move pointer to shoter line
            if(height[left] < height[right]){
                left++;
            } else {
                right --;
            }
        }
        System.out.println("Maximum water: " + maxArea);
    }
}
