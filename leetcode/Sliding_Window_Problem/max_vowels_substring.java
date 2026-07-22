// 1456: Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
// Example 1:
// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

class Solution {
    public int maxVowels(String s, int k) {

        // Store vowels
        HashSet<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int l = 0;
        int count = 0;      // Vowels in current window
        int maximum = 0;    // Maximum vowels found

        // Build first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            maximum = count;
        }

        // Slide the window
        for (int r = k; r < s.length(); r++) {

            // Remove left character
            if (vowels.contains(s.charAt(r - k))) {
                count--;
            }

            // Add right character
            if (vowels.contains(s.charAt(r))) {
                count++;
            }

            // Update answer
            maximum = Math.max(maximum, count);
        }

        return maximum;
    }
}
