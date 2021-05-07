package leetcode_02;

public class test17 {
    public int countSegments(String s) {
        if(s.trim().length() == 0)
            return 0;
        String [] arr = s.split("\\s+");
        if(arr[0].length() == 0)
            return arr.length-1;
        return arr.length;
    }

    public static void main(String[] args) {
        test17 t = new test17();
        System.out.println(t.countSegments("  aaa b  cc"));
    }
}
