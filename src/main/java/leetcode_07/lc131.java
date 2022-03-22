package leetcode_07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class lc131 {
    //回溯算法
    List<List<String>> res = new ArrayList<>();

    //index是起始字符的索引，len是字符串s的长度，
    // path是记录从根节点到叶子节点的路径，res记录所有的结果。
    private void dfs(char[] chars, int index, int len, Deque<String> path){
        if(index == len){
            res.add(new ArrayList<>(path));
            System.out.println("向res中添加path："+path.toString());
            System.out.println("res中元素："+res.toString());
            return;
        }
        for(int i=index; i<len; i++){
            if(!checkPalindrome(chars,index,i)){
                System.out.println("当前字符不是回文串："+new String(chars,index,i+1-index));
                continue;
            }
            path.addLast(new String(chars,index,i+1-index));
            System.out.println("向path中添加元素"+new String(chars,index,i+1-index));
            System.out.println("递归前的path："+path.toString());
            dfs(chars,i+1,len,path);
            path.removeLast();
            System.out.println("递归后的path:" +path.toString());
        }
    }

    //判断chars数组中从left到right位置是不是回文字符串
    private boolean checkPalindrome(char[] chars, int left, int right){
        while(left < right){
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        res.clear();
        int len = s.length();
        if(len == 0){
            return res;
        }
        Deque<String> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        dfs(chars,0,len,deque);
        return res;
    }

    public static void main(String[] args) {
        lc131 lc = new lc131();
        System.out.println(lc.partition("aabbccddeeffgg"));
    }
}
