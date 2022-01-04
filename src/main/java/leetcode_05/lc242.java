package leetcode_05;

import java.util.HashMap;

public class lc242 {
    //时间复杂度：O(n)
    //空间复杂度：O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] nums = new int[26];
        for(int i=0; i<s.length(); i++)
            nums[s.charAt(i) - 'a']++;
        for(int j=0; j<t.length(); j++){
            int temp = t.charAt(j)-'a';
            if(nums[temp] > 0)
                nums[temp]--;
            else
                return false;
        }
        return true;
    }
}
