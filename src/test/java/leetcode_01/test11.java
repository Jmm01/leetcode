package leetcode_01;

public class test11 {
    public String addBinary(String a, String b) {
        boolean flag = true;
        if(Integer.parseInt(a) == 0 ){
            return b;
        }else if(Integer.parseInt(b) == 0 ){
            return a;
        }
        int[] aa = new int[a.length()];
        int[] bb = new int[b.length()];
        if(a.length()>b.length()){
            int[] res = new int[a.length()];

            for(int i=0; i<a.length(); i++){
                aa[a.length()-1-i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            for(int i=0; i<b.length(); i++){
                bb[b.length()-1-i] = Integer.parseInt(String.valueOf(b.charAt(i)));
            }
            for(int i=0;i<a.length();i++){
                res[i] = aa[i];
            }
            int leng = a.length()>b.length()?b.length():a.length();
            for(int i=0; i<leng; i++){
                int numa = aa[i];
                int numb = bb[i];

                res[i] = numa+numb;
            }
            for(int i=0; i<res.length;i++){
                if(res[i]==2){
                    if(i!=res.length-1){
                        res[i+1] += 1;
                        res[i] = 0;
                    }else {
                        res[i] = 0;
                    }

                }else if(res[i]==3){
                    if(i!=res.length-1){
                        res[i+1] += 1;
                        res[i] = 1;
                    }else {
                        flag = false;
                        res[i] = 1;
                    }
                }
            }
            String str = "";
            if(res[res.length-1] == 0 || flag==false){
                int[] newRes = new int[res.length+1];
                for(int i = 0; i<res.length; i++){
                    newRes[newRes.length-1-i] = res[i];
                }
                newRes[0] = 1;
                for(int k=0; k<newRes.length;k++){
                    String s = String.valueOf(newRes[k]);
                    str = str+s;
                }
                return str;
            }else{
                int[] newRes = new int[res.length];
                for(int i = 0; i<res.length; i++){
                    newRes[newRes.length-1-i] = res[i];
                }
                for(int k=0; k<newRes.length;k++){
                    String s = String.valueOf(newRes[k]);
                    str = str+s;
                }
                return str;
            }
        }else {
            for(int i=0; i<a.length(); i++){
                aa[a.length()-1-i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            for(int i=0; i<b.length(); i++){
                bb[b.length()-1-i] = Integer.parseInt(String.valueOf(b.charAt(i)));
            }
            int[] res = new int[b.length()];
            for(int i=0;i<b.length();i++){
                res[i] = bb[i];
            }
            int leng = a.length()>b.length()?b.length():a.length();
            for(int i=0; i<leng; i++){
                int numa = aa[i];
                int numb = bb[i];

                res[i] = numa+numb;
            }
            for(int i=0; i<res.length;i++){
                if(res[i]==2){
                    if(i!=res.length-1){
                        res[i+1] += 1;
                        res[i] = 0;
                    }else {
                        res[i] = 0;
                    }
                }else if(res[i]==3){
                    if(i!=res.length-1){
                        res[i+1] += 1;
                        res[i] = 1;
                    }else {
                        flag = false;
                        res[i] = 1;
                    }
                }
            }
            String str = "";
            if(res[res.length-1] == 0 || flag==false){
                int[] newRes = new int[res.length+1];
                for(int i = 0; i<res.length; i++){
                    newRes[newRes.length-1-i] = res[i];
                }
                    newRes[0] = 1;
                for(int k=0; k<newRes.length;k++){
                    String s = String.valueOf(newRes[k]);
                    str = str+s;
                }
                return str;
            }else{
                int[] newRes = new int[res.length];
                for(int i = 0; i<res.length; i++){
                    newRes[newRes.length-1-i] = res[i];
                }
                for(int k=0; k<newRes.length;k++){
                    String s = String.valueOf(newRes[k]);
                    str = str+s;
                }
                return str;
            }
        }
    }
    public static void main(String[] args) {
        test11 t = new test11();
        String a = "1111";
        String b = "1111";
        System.out.println(t.addBinary(a,b));
    }
}
