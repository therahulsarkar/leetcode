class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        String vowel = "aeiouAEIOU";
        char arr[] = s.toCharArray();

        while(i<j){
            while(i<j && vowel.indexOf(arr[i]) == -1)   {
                i++;
            } 
            while(i<j && vowel.indexOf(arr[j]) == -1)   {
                j--;
            } 

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }

        return new String(arr);
    }
}