public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m - 1, k = n - 1, i = m + n - 1;

        while (j >= 0 && k >= 0) {
            if (nums1[j] >= nums2[k]) {
                nums1[i--] = nums1[j--];
            } else {
                nums1[i--] = nums2[k--];
            }
        }
        while (k >= 0) {
            nums1[i--] = nums2[k--];
        }
        return nums1;
    }
}
