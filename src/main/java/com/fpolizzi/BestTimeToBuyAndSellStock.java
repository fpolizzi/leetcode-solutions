package com.fpolizzi;

/**
 * Created by fpolizzi on 7/23/26
 */
public class BestTimeToBuyAndSellStock {

    static void main() {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println((maxProfit(prices)));
    }

    public static int maxProfit(int[] prices) {

        int minimum = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for (int price : prices) {
            if (price < minimum) {
                minimum = price;
            } else if (price - minimum > maximumProfit) {
                maximumProfit = price - minimum;
            }
        }

        return maximumProfit;
    }
}
