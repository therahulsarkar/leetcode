class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;

        Queue<String> queue  = new LinkedList<>();
        HashMap<String, Boolean> map = new HashMap<>();

        for(int i =0 ; i<wordList.size(); i++){
            map.put(wordList.get(i) ,false);
        }

        queue.add(beginWord);
        map.put(beginWord, true);

        int length = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                String word = queue.poll();
                if(word.equals(endWord)){
                    return length;
                }
                checkAllWordCombinations(word, queue, map);
            }
            length++;
        }
        return 0;
    }

    private static void checkAllWordCombinations(String word, Queue<String> queue, HashMap<String, Boolean> map){
        for(int i =0; i<word.length(); i++){
            char arr[] = word.toCharArray();
            for(int j = 0; j<26; j++){
                char c = (char)('a' + j);
                arr[i] = c;
                String str = String.valueOf(arr);
                if(map.containsKey(str) && map.get(str) == false){
                    queue.add(str);
                    map.put(str, true);
                }
            }
        }
    }
}