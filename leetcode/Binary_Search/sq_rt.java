// 69: sqrt(x)
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
// https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {
        int ans=0;
        int low=1; //bcs if low=0 and when x=1 then mid will become 0 which will give error
        int high=x;
        if (x == 0) return 0; //again will give error for x=0
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid <= x / mid){ //instead of doing mid*mid
                ans=mid;
                low=mid+1; //is there a better ans?
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
