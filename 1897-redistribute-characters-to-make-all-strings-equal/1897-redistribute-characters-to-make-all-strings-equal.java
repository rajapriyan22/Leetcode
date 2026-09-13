class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        

        for(String word:words){
            for(char c:word.toCharArray()){
                 map.put(c,map.getOrDefault(c,0)+1);
            }
        }int n=words.length;
        for(Map.Entry<Character,Integer>key:map.entrySet()){
            if(key.getValue()%n!=0){
                return false;
            }
        }
        return true;
    }
}