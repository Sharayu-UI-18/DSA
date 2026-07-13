// 258: Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
// Example 1:
// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
// https://leetcode.com/problems/add-digits/description/?envType=problem-list-v2&envId=prshgx6i
 
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        else if(num%9==0) return 9; // 
        else return num%9;
    }
}
// all numbers and the addition of their digits when divided by 9 will return the same remainder and all 9 multiples will
// return 0 so we dont bother to add digits as it is giving same remainder 
// 1, 10, 100.. all have 1
// 2, 11, 20.. all have 2
// 3, 12, 21.. all have 3
// 9, 18, 27.. all have 0
