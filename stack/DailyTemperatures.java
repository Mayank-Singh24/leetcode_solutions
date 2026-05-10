class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                int a = s.pop();
                ans[a] = i - a;
            }
            s.push(i);
        }
        return ans;
    }
}