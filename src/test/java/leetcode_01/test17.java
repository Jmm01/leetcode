package leetcode_01;

public class test17 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ')
                res.append("%20");
            else
                res.append(c);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        test17 t = new test17();
        String s = "We are happy.";
        System.out.println(t.replaceSpace(s));

    }

}
