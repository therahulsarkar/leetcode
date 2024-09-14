class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBracket = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i =0 ; i<s.length(); i++){
            //If ( or * is encountered then push the index into stack 
            if(s.charAt(i) == '('){
                openBracket.push(i);
            } else if(s.charAt(i) == '*'){
                star.push(i);
            }else{ // ")" bracket has been encountered
                if(!openBracket.isEmpty()){ //If there is corresponding ( bracket then pop 
                    openBracket.pop();
                }else if(!star.isEmpty()){ //If there is no corresponding ( but there is * then pop that star 
                    star.pop();
                }else{ //If ( or * isnt there then its not valid string
                    return false; 
                }
            }
        }

        while(!openBracket.isEmpty()){
            if(star.isEmpty()){
                return false;
            } else if (openBracket.peek() < star.peek()){
                openBracket.pop();
                star.pop();
            }else{
                return false;
            }
        }

        return true;
    }
}