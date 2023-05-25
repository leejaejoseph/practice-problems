class Solution {
    public int[] replaceElements(int[] arr) {
        int prev = -1;
        int highest = -1;
        for (int i = arr.length - 1; i > -1; i--) {
            int temp = arr[i];
            if (i + 1 == arr.length) {
                highest = arr[i];
                arr[i] = -1;
                continue;
            }
            if (arr[i] > highest) {
                prev = highest;
                highest = arr[i];
                arr[i] = prev;
            } else {
                arr[i] = highest;
            }
        }
        return arr;
    }
}
