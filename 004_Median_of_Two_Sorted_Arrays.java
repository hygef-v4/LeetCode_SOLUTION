
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int i;
        for (i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }

        for (; i - nums1.length < nums2.length; i++) {
            merge[i] = nums2[i - nums1.length];
        }
        Arrays.sort(merge);  // 1 2 3 
        int n = merge.length;

        return n % 2 == 0 ? (merge[n / 2] + merge[n / 2 - 1]) / 2.0
                : merge[n / 2];

    }
}
