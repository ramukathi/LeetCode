import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int Max = nums[0];
        int Min = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = Max;
                Max = Min;
                Min = temp;
            }

            Max = Math.max(nums[i],Max*nums[i]);
            Min = Math.min(nums[i],Min*nums[i]);
            result = Math.max(result,Max); 
        }
        return result;
    }
}