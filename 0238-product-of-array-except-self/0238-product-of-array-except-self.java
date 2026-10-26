class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        // Pass 1: Calculate the prefix products and store them directly in arr
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = prefix;
            prefix *= nums[i];
        }
        
        // Pass 2: Calculate the suffix products on the fly and multiply them into arr
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] *= suffix;
            suffix *= nums[i];
        }
        return arr;
    }
}
