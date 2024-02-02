//https://leetcode.com/problems/happy-number/submissions/



class Solution {
    public boolean isHappy(int n) {
       int slow= n;
        int fast= n;
        
        do{
            slow= square(slow); // noral square of a number(moving ahead 1 time)
            fast= square(square(fast));
            if(slow == 1){
                return true;
            }
        }while(slow != fast); 
        return false;
    }
    
    
    public int square(int num){ 
        int ans=0;
        while(num > 0){
            int rem= num % 10;
            ans+= rem*rem;
            num= num / 10;
        }
        return ans; 
    }
}