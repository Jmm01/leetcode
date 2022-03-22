package leetcode_06;

import java.util.Stack;

public class lc32 {
    public int longestValidParentheses(String s) {
        int res = 0;
        int temp = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int[] mark = new int[s.length()];
        for(int i=0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '('){
                stack.push(i);
            }else {
                if(stack.isEmpty())
                    mark[i] = 1;
                else
                    stack.pop();
            }
        }
        while (!stack.isEmpty())
            mark[stack.pop()] = 1;
        for(int i=0; i<mark.length; i++){
            if(mark[i] == 1){
                temp = 0;
                continue;
            }
            temp ++;
            res = Math.max(temp,res);
        }
        return res;
    }

    public static void main(String[] args) {
        lc32 l = new lc32();
        System.out.println(l.longestValidParentheses("()"));
        System.out.println(l.longestValidParentheses("()(()"));
//        int res = 0, temp = 2;
//        res = Math.max(temp+=2,res);
//        System.out.println(res +","+temp);
        System.out.println(l.longestValidParentheses(" "));
    }
}
