package Arrays;

import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days (n): ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices: ");
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < n; i++){

            minPrice = Math.min(prices[i], minPrice);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

//another method
//int minPrice = Integer.MAX_VALUE;
//int maxProfit = 0;
//
//for(int i = 0; i < n; i++){
//    if(prices[i] < minPrice){
//        minPrice = prices[i];
//        }
//
//    int profit = prices[i] - minPrice;
//
//    if(profit > maxProfit){
//        maxProfit = profit;
//        }
//       }
