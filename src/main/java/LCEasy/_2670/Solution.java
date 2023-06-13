package LCEasy._2670;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int unique = 0;
        int len = nums.length;
        int[] copy = new int[len];
        for(int i = 0; i < len; i++)
            copy[i] = nums[i];
        for(int i = 0; i < len; i++){
            if(s.add(copy[i])){
                nums[i] = ++unique;
            }
            else{
                nums[i] = nums[i-1];
            }
        }
        s.clear();
        unique = 0;
        for(int i = len - 1; i >= 0; i--){
            if(s.add(copy[i])){
                nums[i] -= unique++;
            }
            else{
                nums[i] -= unique;
            }
        }
        return nums;
    }
}