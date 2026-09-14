class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
    
List<Integer> visited=new ArrayList<>();
List<Integer> answer =new ArrayList<>();
int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
               visited.add(nums[i]);
               count=0;
            }else{
               count++;
               if(count<=visited.size()){
                answer.add(visited.get(visited.size()-count));
               
            
               }else{
                answer.add(-1);
               }
            }
        }
        return answer;
    }
}