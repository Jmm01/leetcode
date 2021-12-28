package leetcode_01;

import java.util.Stack;

public class Solution {
    /*
����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ��� s ���ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պ�*/
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

