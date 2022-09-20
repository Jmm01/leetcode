package leetcode_09;

public class lc796 {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        s = s+s;
        return s.contains(goal);
    }
}
