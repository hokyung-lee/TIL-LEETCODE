class Solution {
    public int[] getConcatenation(int[] nums) {
        int groupSize = nums.length;
        int[] newNums = new int[groupSize*2];
        
        for (int i=0; i<newNums.length; i++) {
            newNums[i] = nums[i%groupSize];
        }
        
        return newNums;
    }
}