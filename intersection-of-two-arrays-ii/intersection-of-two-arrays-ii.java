class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        
        for (Integer num1 : nums1) {
            numbers1.add(num1);
        }
        
        for (Integer num2 : nums2) {
            numbers2.add(num2);
        }
        
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        
        if (nums1Length > nums2Length) {
            for (Integer num2: nums2) {
                if (numbers1.contains(num2)) {
                    numbers1.remove(Integer.valueOf(num2));
                    result.add(num2);   
                }
            }    
        } else {
            for (Integer num1: nums1) {
                if (numbers2.contains(num1)) {
                    numbers2.remove(Integer.valueOf(num1));
                    result.add(num1);   
                }
            }
        }
        
        
        int[] resultArray = result.stream().mapToInt(Number::intValue).toArray();
        
        return resultArray;
    }
}