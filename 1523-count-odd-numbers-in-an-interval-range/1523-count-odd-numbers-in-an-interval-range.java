class Solution {
    public int countOdds(int low, int high) {
        int elementCount = (high - low) + 1;
        
        if (low%2==1 && high%2==1) { // 둘다 홀수
            return elementCount/2 + 1;
        }
        
        return elementCount/2;
    }
}