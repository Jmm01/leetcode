package leetcode_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test4 {
    //49.字母异位词分组
    //用质数表示26个字母，用乘积来判断字符串是否相等。
    public List<List<String>> groupAnagrams(String[] strs) {
        //创建质数表，对应26个字母
        int[] nums = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        //创建存储结果的map,key是字符串对应的质数乘积，ArrayList是存放对应的所有字符串
        Map<Double,ArrayList> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String str = strs[i];
            //用来存放每个字符串的最终乘积
            double product = 1;
            //遍历字符串计算乘积
            for(int j=0; j<str.length(); j++){
                int temp = nums[str.charAt(j)-'a'];
                product = product*temp;
            }
            //将字符串和对应的乘积放进map中
            if(map.get(product) != null)
                map.get(product).add(str);
            else {
                ArrayList list = new ArrayList();
                list.add(str);
                map.put(product,list);
            }
        }
        //将map转换为List<List<String>>返回
        List<List<String>> res = new ArrayList<>();
        for(double num:map.keySet())
            res.add(map.get(num));
        return res;
    }

    public static void main(String[] args) {
        test4 t = new test4();
        String[] strs = new String[]{"abc","bca","ccd","dcc","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        System.out.println(t.groupAnagrams(strs));
    }
}
