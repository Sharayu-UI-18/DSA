// 11: You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=two-pointers


class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1; //left pointer at start and right at end 
        int maxArea = 0;

        // Move pointers toward each other
        while (left <= right) {
            int width = right - left; // Distance between lines
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * width; // Compute water contained

            maxArea = Math.max(maxArea, area); // Update max water

            // Move the pointer pointing to the shorter height
            if (height[left] < height[right]) {
                left++; // Move left pointer forward
            } else {
                right--; // Move right pointer backward
            }
        }
        return maxArea;
    }
}
