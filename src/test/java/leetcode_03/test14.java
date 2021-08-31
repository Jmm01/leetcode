package leetcode_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//debug��Ҳû��������.����
public class test14 {
    //�洢�����
    List lists = new ArrayList();
    public List<String> generateParenthesis(int n) {
        generate(n, n, "");
        return lists;
    }
    //����˽�з������ݹ�
    //L����ʾ�����ŵ�������R����ʾ�����ŵ�������s����ʾҪ��ӵķ���
    private void generate(int L, int R, String s){
        //�ݹ���ֹ���������������Ŷ�����
        if(R == 0 && L == 0){
            lists.add(s);
            return;
        }

        //����������ţ�����ƴ��������
        if(L > 0){
            generate(L - 1, R, s+"(");
        }
        //��ʹ�õ�������Ҫ���ڵ��������Ų�����Ч�պϣ�����ʣ���L<=R
        //����ֻҪL<R���Ϳ�����������ţ���L=Rʱ���Ͳ��������������
        if(L < R){
            generate(L, R - 1, s+")");
        }

    }

    public static void main(String[] args) {
        test14 t = new test14();
        System.out.println(t.generateParenthesis(3));
    }
}
