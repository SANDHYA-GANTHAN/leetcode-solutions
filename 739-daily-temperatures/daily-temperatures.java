class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int k=0;
        for(int i=1;i<temperatures.length;i++)
        {
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()])
            { 
                int n = stack.pop();
                result[n]=i-n;
                k++;
            }
            stack.push(i);
        }
        return result;
    }
}