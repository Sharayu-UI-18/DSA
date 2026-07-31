// 34: Find First and last occurence of an element in a sorted array
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);

        return new int[]{first, last};
    }

    public int binarySearch(int[] nums, int target, boolean findFirst) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {

                ans = mid; //save ans and last mid we save before loop becomes invalid is the correct ans

                if (findFirst) {
                    end = mid - 1; //for first occurence will execute when true
                } else {
                    start = mid + 1; //for last occurence will execute when false
                }

            } else if (nums[mid] < target) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return ans;
    }
}
