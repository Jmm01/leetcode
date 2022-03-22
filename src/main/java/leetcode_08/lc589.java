package leetcode_08;

import java.util.ArrayList;
import java.util.List;

public class lc589 {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList();
        return preOrder(root,list);
    }

    private List<Integer> preOrder(Node node, List list) {
        //如果节点值为空，返回list即可，递归终止条件
        if (node == null)
            return list;
        else {
            //先将当前节点的值保存到list中
            list.add(node.val);
            //遍历子节点，同样进行前序遍历，保存在list中
            for (int i=0; i<node.children.size(); i++){
                preOrder(node.children.get(i),list);
            }
            return list;
        }
    }
}
