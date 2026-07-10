// 643- Maximum Average Subarray- I
// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
// https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0; // l and r are indices not elements
        
        double windowsum=0;
        for(int r=0; r<k; r++) { //only running first window
            windowsum=windowsum+nums[r];
        }
        
        double maxavg=windowsum/k; // dont initialise with 0 bcs negative numbers exist

        for(int r=k; r<nums.length; r++){ //loop starts with k bcs first window has already ran 
            windowsum=windowsum+nums[r]-nums[l];
            l++;
            double avg=windowsum/k;
            if(avg>maxavg){
                maxavg=avg;
            }

        }
        return maxavg;
    }
}
