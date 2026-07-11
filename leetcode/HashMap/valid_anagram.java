// 242: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// https://leetcode.com/problems/valid-anagram/description/
// asked in uber

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> maps= new HashMap<>(); //hashmap for first string <letter,freq>
        
        if(s.length()!=t.length()){
            return false;
        }
            for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i); //for strings
            if(maps.containsKey(ch)){
                maps.put(ch, maps.get(ch)+1); //if same letter twice then increase freq+1
            }else{
                maps.put(ch,1);
            }
            }

            for(int i=0; i<t.length(); i++){
                char ch=t.charAt(i);
                if(maps.containsKey(ch)){
                    maps.put(ch, maps.get(ch)-1); //when letter encountered, decrement from hashmap
                }else{
                    return false;
                }
            }

            for(int i=0; i<s.length();i++){
                char ch=s.charAt(i);
                if(maps.get(ch)!=0){
                    return false; //at end hashmap freq should be all zero
                }
            }
            return true;
        }
}
