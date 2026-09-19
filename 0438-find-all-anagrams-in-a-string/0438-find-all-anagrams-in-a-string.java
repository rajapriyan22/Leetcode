class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
       HashMap<Character,Integer> map=new HashMap<>();
       HashMap<Character,Integer> w=new HashMap<>();
       List<Integer> result=new ArrayList<>();
       for(char ch:p.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
       }
int left=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
          w.put(c,w.getOrDefault(c,0)+1);
          if(i-left+1>p.length()){
             char remove=s.charAt(left);
             w.put(remove,w.get(remove)-1);
             if(w.get(remove)==0){
                w.remove(remove);
             }
             left++;
          }
            if(w.equals(map)){
                result.add(left);
            }

       }
 
       return result;

          }
}