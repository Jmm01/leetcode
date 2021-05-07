package leetcode_01;

class test2 {
    public int strStr(String haystack, String needle) {
        int i = -1;
        boolean flag = true;

        if(needle.length()==0){
            return 0;
        }else if(needle.length()==haystack.length()){
            if(haystack.charAt(0) == needle.charAt(0)){
                for(int k = 0; k<needle.length();k++){
                    if(needle.charAt(k) != haystack.charAt(k)){
                        flag = false;
                    }
                }
                if(flag){
                    return 0;
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        } else if(needle.length() > haystack.length()){
            return -1;
        } else{
            label1:for(int j = 0; j<=haystack.length()-needle.length(); j++){
                if(haystack.charAt(j) == needle.charAt(0)){
                    i = j;
                    flag = true;
                    label:for(int k = 0; k<needle.length();k++){

                        if(needle.charAt(k) != haystack.charAt(j+k)){
                            flag = false;
                        }
                    }
                    if(flag){
                        break label1;
                    }

                }
            }
            if(flag){
                return i;
            }else{
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        test2 t = new test2();
        String haystack = "abc";
        String needle = "c";

        System.out.println(t.strStr(haystack,needle));

    }
}