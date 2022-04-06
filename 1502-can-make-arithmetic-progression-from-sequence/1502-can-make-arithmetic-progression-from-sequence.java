class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        
        int previousGapN = 0;
        
        for(int i=1; i<arr.length; i++) {
            int gapN = Math.abs(arr[i]-arr[i-1]);
            if(i != 1 && previousGapN != gapN) return false;
            previousGapN = gapN;
        }
        
        return true;
    }
}