class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack();        
        Stack<Character> stack2 = new Stack();

        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) != '#'){
                stack1.push(s.charAt(i));
            } else{
                if(stack1.size() > 0)
                    stack1.pop();
            }
        }
        
        String str1 = "";
        
        for(char c: stack1){
            str1 += c;
        }
        
        for(int i = 0; i< t.length(); i++){
            if(t.charAt(i) != '#'){
                stack2.push(t.charAt(i));
            } else{
                if(stack2.size() > 0)
                    stack2.pop();
            }
        }
        
        String str2 = "";
        
        for(char c: stack2){
            str2 += c;
        }
        
        
        
        return str1.equals(str2);
    }
}