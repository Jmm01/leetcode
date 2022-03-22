package leetcode_06;
public class lc1220 {
    public int countVowelPermutation(int n) {
        int M = (int) (1e9+7);
        long a=1, e=1, i=1, o=1, u=1;
        for(int k=2; k<=n; k++){
            long aa = (e+i+u)%M;
            long ee = (a+i)%M;
            long ii = (e+o)%M;
            long oo = i;
            long uu = (o+i)%M;
            a = aa;
            e = ee;
            i = ii;
            o = oo;
            u = uu;
        }
        return (int) ((a+e+i+o+u)%M);
    }
    public static void main(String[] args) {
        lc1220 l = new lc1220();
        System.out.println(l.countVowelPermutation(5));
    }

}
