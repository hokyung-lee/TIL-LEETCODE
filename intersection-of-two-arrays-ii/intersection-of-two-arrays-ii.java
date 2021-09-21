class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Sorting
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Init Variable
        List<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        int m = nums1.length;
        int n = nums2.length;
        
        // Check
        while(p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                result.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        
        // Return result
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}