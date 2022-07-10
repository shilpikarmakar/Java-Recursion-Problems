public class Knapsack {
    static int knapsack01(int[] prices, int[] weights, int maxWeight, int index)
    {
        if(index == weights.length || maxWeight == 0)
        {
            return 0;
        }
        if(weights[index] > maxWeight)
        {
            return knapsack01(prices, weights, maxWeight, index+1);
        }
        else
        {
            int option1 = knapsack01(prices, weights, maxWeight, index+1);
            int option2 = prices[index] + knapsack01(prices, weights, maxWeight-weights[index], index+1);
            return Math.max(option1, option2);
        }
    }
    public static void main(String[] args) {
        int maxWeight = 3;
        int[] prices = {60, 100, 120};
        int[] weights = {1, 2, 2};
        int maxProfit = knapsack01(prices, weights, maxWeight, 0);
        System.out.println(maxProfit);
    }
}
