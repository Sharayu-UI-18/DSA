//TwoSum: leetcode problem 1
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//https://leetcode.com/problems/two-sum/description/

//brute force approach: time-O(n²) space-O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target==nums[i]+nums[j]){
                    return new int[]{i,j}; //syntax for returning value in java
                }
            }
        }
        return new int[]{};
    }
}

//hashmap approach: time-O(n) space-O(n)
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
