class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int orginalNumber = x;
        int reverseNumber = 0;
        while(x > 0){
            int r = x%10;
            reverseNumber = reverseNumber*10 + r;
            x = x/10;
        }
        
        if (orginalNumber==reverseNumber){
            return true; 
        }
        
        return false;
    }
}