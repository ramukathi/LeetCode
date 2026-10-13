class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ExpectedSum = n*(n+1)/2;
        int Actualsum=0;
        for(int i=0;i<nums.length;i++){
            Actualsum+= nums[i];
        }
        return ExpectedSum-Actualsum;
        
    }
}