class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int numSize = nums.length;
        int[] result = new int[numSize];
        
        for(int i=0; i<numSize; i++) {
            result[i] = searchSmallerNumber(nums, nums[i]);
        }
        
        return result;
    }
    
    private int searchSmallerNumber(int[] nums, int num) {
        int result = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < num) {
                result += 1;
            }    
        }
        
        return result;
    }
}