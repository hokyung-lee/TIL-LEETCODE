class Solution {
    public boolean checkRecord(String s) {
        char[] convertedS = s.toCharArray();
        
        int absent=0;
        int late=0;
        
        for (int i=0; i<convertedS.length; i++) {
            if (convertedS[i]=='A')  {
                absent++;
                late=0;
            }
            if (convertedS[i]=='P') {
                late=0;
            }
            if (convertedS[i]=='L') {
                late++;
            }
            if (absent>=2 || late>=3) return false;
        }
                
        return true;
    }
    
    
}