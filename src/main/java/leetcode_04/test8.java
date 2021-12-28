package leetcode_04;

public class test8 {
    //面试题01.03.URL化
    //使用字符数组然后再判断
    public String replaceSpaces(String S, int length) {
        char[] ch = S.toCharArray();
        //得到原数组的有效空格数
        int k=0;
        for(int i=0; i<length; i++){
            if(ch[i] == ' ')
                k++;
        }
        //定义用来替换的数组
        char[] chars = new char[length+k*2];
        int j=0;
        for(int i=0; i<length; i++){
            if(ch[i]==' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            }else
                chars[j++] = ch[i];
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        test8 t = new test8();
        System.out.println(t.replaceSpaces("               ",5));
    }
}
