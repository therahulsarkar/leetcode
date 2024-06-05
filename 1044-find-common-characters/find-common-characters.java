class Solution {
    public List<String> commonChars(String[] words) {
        
        int maxFrequency[] = new int[26];
        
        Arrays.fill(maxFrequency, Integer.MAX_VALUE);
        
        for(String currentWord : words){
            int charCount[] = new int[26];
            
            for(char eachChar : currentWord.toCharArray()){
                charCount[eachChar - 'a']++;
            }
            
            for(int i = 0; i<26; i++){
                maxFrequency[i] = Math.min( maxFrequency[i], charCount[i]);
            }
        }
        
        
        List<String> result = new ArrayList<>();
        for(int i = 0; i<26; i++){
            while(maxFrequency[i] > 0){
                result.add(String.valueOf((char)(i + 'a')));
                maxFrequency[i]--;
            }
        }
        
        return result;
        
    }
}