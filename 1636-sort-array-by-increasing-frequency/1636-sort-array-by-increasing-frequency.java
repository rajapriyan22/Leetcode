class Solution {
    public int[] frequencySort(int[] nums) {
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
         }
        int min=Integer.MAX_VALUE;
        int maxvalue=Integer.MIN_VALUE;
        int k=0;
   int [] result=new int[nums.length];
   while(k<nums.length){
      min = Integer.MAX_VALUE;
    maxvalue = Integer.MIN_VALUE;
        for(int num:map.keySet()){
            int keyy=map.get(num);
            if(keyy<min||keyy==min&&num>maxvalue){
                min=keyy;
                maxvalue=num;
            }

        
      
       
   }
     for(int i=0;i<min;i++){
            result[k++]=maxvalue;
        }
    map.remove(maxvalue);  
        
   }
        return result;   
    
}
}