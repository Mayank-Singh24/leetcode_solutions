class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<>();
        int ans = 0;

        for(String token : tokens){
            try{
               int n = Integer.parseInt(token);
                s.push(n);
            }
            catch(NumberFormatException e){
                int a = s.pop();
                int b = s.pop();

                if(token.equals("+")){
                    ans = a + b;
                    s.push(ans);
                }
                else if(token.equals("-")){
                    ans = b - a;
                    s.push(ans);
                }
                else if(token.equals("*")){
                    ans = a * b;
                    s.push(ans);
                }
                else{
                    ans = b / a;
                    s.push(ans);
                }
            }
        }
        return s.peek();
    }
}