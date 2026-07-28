// 904: Fruits into basket- asked in google
// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// https://leetcode.com/problems/fruit-into-baskets/description/

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int left=0;
        int ans=0;
    
        for(int right=0; right<fruits.length; right++){
            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.get(fruits[right])+1); //first push fruit and freq in hashmap
                }
            else {
                map.put(fruits[right],1);
            }
            while(map.size()>2){ //for invalid condition
                map.put(fruits[left], map.get(fruits[left])-1); //reduce freq of left
                
                
                if(map.get(fruits[left])==0) map.remove(fruits[left]); //if freq 0 then remove from hashmap
                left++; //remember to increment after processing full left
            }
            ans=Math.max(ans, right-left+1);
        }
        return ans;
    }
}
