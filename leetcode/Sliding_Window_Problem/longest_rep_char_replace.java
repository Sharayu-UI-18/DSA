// 424: Longest Repeating Character Replacement
// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
// Return the length of the longest substring containing the same letter you can get after performing the above operations.
// Example 1:
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
// https://leetcode.com/problems/longest-repeating-character-replacement/description/


class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxfreq=0;
        int windowlen=0;
        int ans=0;
        HashMap<Character, Integer> map= new HashMap<>();
        for(int right=0; right<s.length(); right++){
            Character ch= s.charAt(right);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
            maxfreq= Math.max(maxfreq, map.get(ch));
            windowlen=right-left+1;
            while((windowlen-maxfreq)>k){ //invalid condition
                if(map.get(s.charAt(left))==0) {map.remove(s.charAt(left));}
                else{
                    map.put(s.charAt(left), map.get(s.charAt(left))-1);
                }
                left++;
                windowlen=windowlen-1;

            }
            ans=Math.max(ans, windowlen);
        }
        return ans;
    }
}
