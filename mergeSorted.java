public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return nums1;
        }
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        while (idx != nums1.length) {
            System.out.println(nums1[idx1] + " & " + nums2[idx2] + "idx: " + idx  + "m" + m);
            if (nums1[idx1] < nums2[idx2]) {
              if ( idx1 != m) {
                idx1++;
              }
            } else if (nums1[idx1] >= nums2[idx2]) {
                for (int i = nums1.length - 2; i > idx - 1; i--) {
                  System.out.println(idx);
                  System.out.println(i);
                  nums1[i + 1] = nums1[i];
                }
                nums1[idx] = nums2[idx2];
                idx1++;
                idx2++;
            } else {
              nums1[idx] = nums2[idx2];
            }
            idx++;
        }
        return nums1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] result = solution.merge(nums1, m, nums2, n);

        System.out.println("Merged array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
