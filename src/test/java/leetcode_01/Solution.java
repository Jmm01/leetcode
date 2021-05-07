package leetcode_01;

import java.util.Stack;

public class Solution {
    /*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合*/
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    if( ch == ')' && stack.pop() != '('){
                        return false;
                    }else if( ch == ']' && stack.pop() != '['){
                        return false;
                    }else if( ch == '}' && stack.pop() != '{'){
                        return false;
                    }/*else{
                        stack.pop();
                    }*/

                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Solution t = new Solution();
        String arr = "{[]}";
        boolean str = t.isValid(arr);
        System.out.println(str);
    }
}

