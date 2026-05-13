class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> s = new Stack<>();
        int width = 0;
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++){
            while(!s.isEmpty() && heights[i] < heights[s.peek()]){
                int a = s.pop();
                if(s.isEmpty()){
                    width = i;
                }
                else{
                    width = i - s.peek() - 1;
                }
                int area = heights[a] * (width);
                maxArea = Math.max(area, maxArea);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
                int a = s.pop();
                if(s.isEmpty()){
                    width = heights.length;
                }
                else{
                    width = heights.length - s.peek() - 1;
                }
                int area = heights[a] * (width);
                maxArea = Math.max(area, maxArea);
            }
        return maxArea;
    }
}