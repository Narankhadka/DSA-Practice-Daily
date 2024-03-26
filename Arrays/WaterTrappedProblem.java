public class WaterTrappedProblem {
    // Method to calculate the amount of trapped rainwater
    public static int TrapdRainWater(int height[]) {
        // calculate left max boundary array
        int n = height.length; // Get the length of the height array
        int leftMax[] = new int[n]; // Initialize an array to store left boundary maximums
        leftMax[0] = height[0]; // Set the left boundary maximum of the first element as the height of the first element
        for (int i = 1; i < n; i++) { // Iterate through the height array starting from the second element
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // Calculate the maximum height encountered so far from the left
        }

        // calculate right max boundary array
        int rightMax[] = new int[n]; // Initialize an array to store right boundary maximums
        rightMax[n - 1] = height[n - 1]; // Set the right boundary maximum of the last element as the height of the last element
        for (int i = n - 2; i >= 0; i--) { // Iterate through the height array starting from the second last element
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // Calculate the maximum height encountered so far from the right
        }
        
        // Initialize a variable to store the total trapped water
        int trappedWater = 0;

        // Calculate trapped water for each element
        for (int i = 0; i < n; i++) { // Iterate through the height array
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // Calculate the water level at the current position
            trappedWater += waterLevel - height[i]; // Calculate the trapped water at the current position
        }
        
        // Return the total trapped water
        return trappedWater;
    }

    // Main method
    public static void main(String[] args) {
        // Given n non-negative integers representing an elevation map where the width
        // of each bar is 1, compute how much water it can trap after raining.
        int height[] = {1,8,6,2,5,4,8,3,7}; // Define the elevation map as an array of heights
        int waterTrapped = TrapdRainWater(height); // Calculate the trapped water
        System.out.println(waterTrapped); // Print the result
    }
}
