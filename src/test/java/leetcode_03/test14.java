package leetcode_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//debug了也没看懂——.——
public class test14 {
    //存储结果集
    List lists = new ArrayList();
    public List<String> generateParenthesis(int n) {
        generate(n, n, "");
        return lists;
    }
    //定义私有方法来递归
    //L：表示左括号的数量，R：表示右括号的数量，s：表示要添加的符号
    private void generate(int L, int R, String s){
        //递归终止的条件是左右括号都用完
        if(R == 0 && L == 0){
            lists.add(s);
            return;
        }

        //如果有左括号，优先拼接左括号
        if(L > 0){
            generate(L - 1, R, s+"(");
        }
        //被使用的左括号要大于等于右括号才能有效闭合，所以剩余的L<=R
        //所以只要L<R，就可以添加右括号，当L=R时，就不能添加有括号了
        if(L < R){
            generate(L, R - 1, s+")");
        }

    }

    public static void main(String[] args) {
        test14 t = new test14();
        System.out.println(t.generateParenthesis(3));
    }
}
