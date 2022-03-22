package leetcode_07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class lc93 {
    //回溯算法
    List<String> res = new ArrayList<>();
    private void ipAddresses(Stack<String> stack, String s,int start){
        //如果拼接字符为4段且遍历到s最后一位，就用.分隔放入结果集
        if(stack.size() == 4 && start == s.length()){
            res.add(stack.get(0)+"."+stack.get(1)+"."+stack.get(2)+"."+stack.get(3));
            return;
        }

        //如果s剩下的元素个数不够拼接字符串为4段，直接返回
        if(s.length()-start < 4-stack.size()) return;
        //如果s剩下的元素个数超过最长拼接字符串为4段，直接返回
        if(s.length()-start > (4-stack.size())*3) return;

        //三种切割长度
        for(int i=1; i<=3; i++){
            //加上要切的长度就越界的话不能切这个长度
            if(start+i-1 >= s.length()) return;
            //不能切出‘0x’ ‘0xx’,只有i=1时，可以拼接.0.
            if(i != 1 && s.charAt(start) == '0') return;
            //当前选择切出的片段
            String str = s.substring(start, start+i);
            //不能超过255
            if(i == 3 && Integer.parseInt(str) > 255) return;
            stack.add(str);
            //基于当前选择继续选择
            ipAddresses(stack,s,start+i);
            //递归结束时，撤销最后的选择，进入下一轮迭代
            stack.pop();
        }

    }
    public List<String> restoreIpAddresses(String s) {
        res.clear();
        Stack<String> stack = new Stack<>();
        ipAddresses(stack,s,0);
        return res;
    }

    public static void main(String[] args) {
        lc93 lc = new lc93();
        System.out.println(lc.restoreIpAddresses("25525511135"));
//        System.out.println(lc.restoreIpAddresses("0000"));
//        System.out.println(lc.restoreIpAddresses("1111"));
    }
}
