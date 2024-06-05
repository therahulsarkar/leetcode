class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            } else{
                stack.pop();
            }
        }
        
        String answer = "";
        
        for(char c: stack){
            answer += c;
        }
        
        return answer;
    }
}