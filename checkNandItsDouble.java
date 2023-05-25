class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return false;
        }
        Set<Double> nums = new HashSet<Double>();
        for(int num : arr) {
            Double number = new Double(num);
            if (nums.contains(number/2) || nums.contains(number*2)) {
                return true;
            }
            nums.add(number);
        }
        return false;
    }
}
