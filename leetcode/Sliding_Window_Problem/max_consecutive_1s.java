// 1004: Maximum Consecutive ones
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//Example 1:
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zerocount=0;
        int ans=0;
        for (int right=0; right<nums.length; right++){
            if(nums[right]==0) zerocount++;
            while(zerocount>k){ //when window is invalid
                if(nums[left]==0) zerocount--; //if left is also 0 increment
                left++;
            }
            ans=Math.max(ans,right-left+1); //keep updating for every window where zerocount<=k
        }
        return ans;
    }
}
