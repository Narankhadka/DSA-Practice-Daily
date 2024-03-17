public class StockBuyAndSell {

    /**
     * This method calculates the maximum profit that can be achieved by buying and selling stocks.
     * @param prices An array of stock prices for each day.
     * @return The maximum profit that can be achieved.
     */
    public static int maxProfit(int prices[]) {
        // Initialize the buy price to the maximum possible value and max profit to 0
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through each day's stock price
        for (int i = 0; i < prices.length; i++) {
            // Check if the current price is greater than the buy price
            if (buyPrice < prices[i]) {
                // Calculate the profit if selling at the current price
                int profit = prices[i] - buyPrice;
                // Update the maximum profit if the current profit is greater
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // If the current price is less than or equal to the buy price,
                // update the buy price to the current price
                buyPrice = prices[i];
            }
        }
        // Return the maximum profit that can be achieved
        return maxProfit;
    }

    public static void main(String[] args) {
        // Example input array of stock prices
        int prices[] = {7, 1, 5, 3, 6, 4};
        // Call the maxProfit method and print the result
        System.out.println(maxProfit(prices));
    }
}
