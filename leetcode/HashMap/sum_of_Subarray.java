//523 problem number: Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
// A good subarray is a subarray where:
// its length is at least two, and
// the sum of the elements of the subarray is a multiple of k.
// https://leetcode.com/problems/continuous-subarray-sum/description/


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map= new HashMap<>(); //creating a hashmap where map is the name and <KeyType, ValueType>
        map.put(0,-1); //inserting 0 remainder at -1 index
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            int remainder= sum%k;
            if(map.containsKey(remainder)){
                if(i-map.get(remainder)>=2) return true; //bcs minimum 2 size subarray condition
            }else{
                map.put(remainder,i); //if new remainder observed insert into mashmap
            }
        }
        return false;
    }
}
