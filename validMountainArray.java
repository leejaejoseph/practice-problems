class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int prev = arr[0];
        if (arr[0] > arr[1]) {
            return false;
        }
        boolean increasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (increasing) {
                if (prev > arr[i]) {
                    increasing = false;
                } else if (prev == arr[i]) {
                    return false;
                }
            } else {
                if (prev <= arr[i]) {
                    return false;
                }
            }
            prev = arr[i];
        }
        if (increasing) {
            return false;
        }
        return true;
    }
}
