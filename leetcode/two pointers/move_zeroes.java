// 283: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=two-pointers

class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]!=0){
                int temp= nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
    }
}

// define left and right pointers at 0 and increment right first and if right is not equal to zero then swap left and right and if zero
// then just increment so at end all non zeroes will come to the front
