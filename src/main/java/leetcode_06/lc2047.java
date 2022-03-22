package leetcode_06;

public class lc2047 {
    public int countValidWords(String sentence) {
        int index = 0;
        int res = 0;
        for(int i=0; i<sentence.length(); i++){
            String word = "";
            if(sentence.charAt(i) == ' '){
                word = sentence.substring(index,i);
                if(validWords(word))
                    res++;
                while(i < sentence.length() && sentence.charAt(i) == ' '){
                    i++;
                }
                index = i;
            }
            if(i == sentence.length()-1) {
                word = sentence.substring(index);
                if(validWords(word))
                    res++;
            }
        }

        return res;
    }
    boolean validWords(String word){
        if(word.length() == 0)
            return false;
        //分别记录连字符和标点符号的出现次数
        int flag1 = 0, flag2 = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            //如果有数字，不符合要求
            if(ch >= '0' && ch <= '9')
                return false;
            //如果出现连字符
            if(ch == '-'){
                flag1 ++;
                if(flag1 > 1 || i==0 || i==word.length()-1 || word.charAt(i-1) < 'a' || word.charAt(i-1) > 'z' || word.charAt(i+1) < 'a' || word.charAt(i+1) > 'z')
                    return false;
            }
            //如果出现标点符号
            if(ch == '!' || ch == '.' || ch == ','){
                flag2++;
                if(flag2 > 1 || i != word.length()-1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc2047 lc = new lc2047();
        System.out.println("sx  1,  x".length());
        System.out.println(lc.countValidWords("sx  1,  x"));
    }

}
