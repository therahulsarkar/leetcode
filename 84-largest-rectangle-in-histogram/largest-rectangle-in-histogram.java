class Solution {
    private int[] findPse(int[] arr){
        Stack<Integer> stack = new Stack();
        int[] pse = new int[arr.length];

        for(int i =0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                pse[i] = -1;
            }else{
                pse[i] = stack.peek();
            }
            stack.push(i);
        }
        return pse;
    }

    private int[] findNse(int[] arr){
        Stack<Integer> stack = new Stack();
        int[] nse = new int[arr.length];

        for(int i =arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nse[i] = arr.length;
            }else{
                nse[i] = stack.peek();
            }
            stack.push(i);
        }
        return nse;
    }

    public int largestRectangleArea(int[] heights) {
        int[] nse = new int[heights.length];
        int[] pse = new int[heights.length];
        int max = 0;

        nse = findNse(heights);
        pse = findPse(heights);

        for(int i=0; i<heights.length; i++){
            max = Math.max(max, heights[i] * (nse[i] - pse[i] -1));
        }

        return max;
    }
}