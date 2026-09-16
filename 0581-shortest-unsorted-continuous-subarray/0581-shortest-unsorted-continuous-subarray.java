class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int []nums=new int[arr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
 Arrays.sort(arr);

 int left=0;
 int right=arr.length-1;
 while(left<right&&arr[left]==nums[left]){
    
    left++;
 }
  while(right>=0&&arr[right]==nums[right]){
    
    right--;
 }
 if(left==nums.length-1){
    return 0;
 }
return right-left+1;
    }
}