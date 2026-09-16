class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
         Arrays.sort(nums);
         for(int i=0;i<nums.length&&k>0;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
         }
         int sum=0;
         int min=nums[0];
         int max=0;
         for(int num:nums){
            sum+=num;
            min=Math.min(min,num);
         }
        if(k%2!=0){
           sum=sum-2*min;
         }


         return sum;

 
    }
}