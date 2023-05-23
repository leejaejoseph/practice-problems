class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numberedSet = new HashSet<Integer>();
        for (int i = 1; i < nums.length + 1; i++) {
            numberedSet.add(i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (numberedSet.contains(nums[j])) numberedSet.remove(nums[j]);
        }
        return new ArrayList<Integer>(numberedSet);
    }
}
