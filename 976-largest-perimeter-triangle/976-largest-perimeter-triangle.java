class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i=n-3; i >= 0; i--) {
            int sum = nums[i] + nums[i+1];
            int max = nums[i+2];
            
            if (sum > max) {
                return sum + max;
            }
        }
        
        return 0;
    }
}