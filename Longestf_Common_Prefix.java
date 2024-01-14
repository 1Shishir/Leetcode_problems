//https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int idx=0;
        while(idx<str1.length() && idx<str2.length()){
            if(str1.charAt(idx)==str2.charAt(idx)){
                idx++;
            }
            else{
            break;
            }
        }
        String ans=str1.substring(0,idx);
    return ans;
    }
}