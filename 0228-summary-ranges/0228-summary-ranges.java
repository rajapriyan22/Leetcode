class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
    int start=0;
    int end=0;
    if(nums.length==0){
        return result;
  }
    for(int i=0;i<nums.length-1;i++){
        
               if(nums[i]!=nums[i+1]-1){
                      
                      if(start==i){
                        result.add(String.valueOf(nums[start]));
                      }else{
                        result.add(nums[start]+"->"+nums[i]);
                      }
                      start=i+1;
               }
               
 
    }
    int last = nums.length - 1;

        if (start == last) {
            result.add(String.valueOf(nums[start]));
        } else {
            result.add(nums[start] + "->" + nums[last]);
        }
    return result;
    }
}