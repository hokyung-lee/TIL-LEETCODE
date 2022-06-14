class Solution {
    public int[] shuffle(int[] nums, int n) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        
        for (int i=0; i<numsLength; i++) {
            result[i] = nums[i/2 + ((i%2==0)?0:n)];
        }
        
        return result;
    }
}