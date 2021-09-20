class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] result = new int[m+n];
        int resultPointer = 0;
        
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        
        
        while(nums1Pointer < m || nums2Pointer < n) {
            
            /* 한쪽 탐색이 끝났을 경우 */
            if (nums1Pointer == m) {
                result[resultPointer++] = nums2[nums2Pointer++];
                continue;
            }
            
            if (nums2Pointer == n) {
                result[resultPointer++] = nums1[nums1Pointer++];
                continue;
            }
            
            /* 양쪽 모두 탐색 중일 경우 */
            if(nums1[nums1Pointer] > nums2[nums2Pointer]) {
                result[resultPointer++] = nums2[nums2Pointer++];
            } else {
                result[resultPointer++] = nums1[nums1Pointer++];
            }
        }
        
        for (int i = 0; i < m+n; i++) {
            nums1[i] = result[i];
        }
    }
}