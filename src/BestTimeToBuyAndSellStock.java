import java.util.Arrays;

class Solution121 {
    public int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < buy) {
                buy = price;
            }
            profit = Math.max(profit, price - buy);
        }

//        int left = 0;
//        int right = 1;
//
//        int profit = 0;
////        int buy;
////        int sell;
//
//        while (right < prices.length) {
//
//            if (prices[left] < prices[right]) {
//                profit = Math.max(prices[right] - prices[left], profit);
//            } else {
//                left = right;
//            }
//            right ++;
//        }


//        for (int i = 0; i < prices.length - 1; i++) {
//            buy = prices[i];
//            sell = prices[i + 1];
//
//            for (int j = i + 1; j < prices.length; j++) {
//                if (sell < prices[j]) sell = prices[j];
//            }
//            if (profit < (sell - buy)) profit = sell - buy;
//
//        }

//        while (left <= right) {
//
//            if (buy > prices[left]) {
//                buy = prices[left];
//            } else left ++;
//
//            if (sell < prices[right]) {
//                sell = prices[right];
//            } else right --;
//
//            if (buy < sell) {
//                profit = sell - buy;
//            }
////            left ++;
////            right --;
//        }
        return profit;
    }
}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();

        int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(solution121.maxProfit(prices1));

        int[] prices2 = new int[]{7, 6, 4, 3, 1};
        System.out.println(solution121.maxProfit(prices2));

        int[] prices3 = new int[]{1, 4, 2};
        System.out.println(solution121.maxProfit(prices3));

        int[] prices4 = new int[]{2, 1};
        System.out.println(solution121.maxProfit(prices4));

        int[] prices5 = new int[]{3, 2, 6, 5, 0, 3};
        System.out.println(solution121.maxProfit(prices5));

        int[] prices6 = new int[]{1, 2};
        System.out.println(solution121.maxProfit(prices6));

    }
}
