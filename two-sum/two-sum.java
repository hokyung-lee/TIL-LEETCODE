class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        
        numbers.put(nums[0], 0);
        
        int[] result = new int[2];
        for (int i = 1; i < nums.length; i++) {
            int num = target - nums[i];
            if (numbers.containsKey(num)) {
                result[0] = numbers.get(num);
                result[1] = i;
            } else {
                numbers.put(nums[i], i);
            }
        }
        
        return result;
    }
}