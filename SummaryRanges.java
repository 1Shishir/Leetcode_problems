//https://leetcode.com/problems/summary-ranges/submissions/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> list = new ArrayList<>();
       int n = nums.length;
       int i = 0;
       
       while (i < n) {
           int j = i;
           while (j < n - 1 && nums[j+1] == nums[j] + 1) {
               j++;
           }
           
           if (i == j) {
               list.add(nums[i]+"");
           } else {
               list.add(nums[i] + "->" + nums[j]);
           }
           
           i = j + 1;
        }
        
        return list;
    }
}