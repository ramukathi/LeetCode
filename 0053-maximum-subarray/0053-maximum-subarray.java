class Solution {
    public int maxSubArray(int[] nums) {
        int CurSum=0;
        int MaxSum = nums[0];

        for(int i=0;i<nums.length;i++){
            CurSum += nums[i];
             if(CurSum>MaxSum){
            MaxSum = CurSum;
        }
        if(CurSum<0){
            CurSum = 0;
        }
        }
        return MaxSum;
    }
}