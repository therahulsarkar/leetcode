class Solution {
    public String minWindow(String s, String t) {
        String result = "";

        //Hashmap to store the count of the  2nd string
        HashMap<Character, Integer> map2 = new HashMap();
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }

        int targetLength = t.length();
        int currentLength = 0;

        int i = -1; int j =-1;
        HashMap<Character, Integer> map1 = new HashMap();
        
        while(true){
            boolean flag1 = false;
            boolean flag2 = false;
            //Add the characters that contains the solution characters / acquire 
            while(i < s.length()-1 && currentLength < targetLength){
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0)+1);
                if(map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)){
                    currentLength++;
                }

            flag1 = true;
            }

            //Collect answer and release for smaller answer
            while(j <i && currentLength == targetLength ){
                String potentialAnswer = s.substring(j+1, i+1);
                if(result.length() == 0 || potentialAnswer.length() <  result.length()){
                    result = potentialAnswer;
                }
                j++;
                char ch = s.charAt(j);
                if(map1.get(ch) == 1){
                    map1.remove(ch); 
                } else{
                    map1.put(ch, map1.getOrDefault(ch, 0)-1);
                }

                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch, 0)){
                    currentLength--;
                }

                flag2 = true;
            }

            if(flag1 == false && flag2 == false){
                break;
            }
        } 

    return result;
        
    }
}