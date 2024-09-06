class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i< s.length(); i++){
            char first = s.charAt(i);
            char second = t.charAt(i);

            if(!map.containsKey(first)){
                if(set.contains(second)){
                    return false;
                }
                else{
                    map.put(first, second);
                    set.add(second);
                }
            }else{
            if(map.get(first) != second){
                return false;
            }   
            }
        }

        return true;
    }
}