package leetcode_09;

public class lc953 {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<words.length-1; i++){
            if(!isOrder(words[i],words[i+1],order))
                return false;
        }
        return true;

    }
    private boolean isOrder(String a, String b, String order){
        int i=0;
        while (i<Math.min(a.length(),b.length())){
            if(order.indexOf(a.charAt(i)) < order.indexOf(b.charAt(i))){
                return true;
            }
            if(order.indexOf(a.charAt(i)) == order.indexOf(b.charAt(i))){
                i++;
                continue;
            }
            if(order.indexOf(a.charAt(i)) > order.indexOf(b.charAt(i))){
                return false;
            }
        }
        return a.length() <= b.length();
    }

    public static void main(String[] args) {
        lc953 lc = new lc953();
        String[] words = new String[]{"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(lc.isAlienSorted(words, order));
//        System.out.println(lc.isOrder("hello", "leetcode", order));
        words = new String[]{"word","world","row"};
        order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(lc.isAlienSorted(words, order));

        words = new String[]{"apple","app"};
        order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(lc.isAlienSorted(words, order));
//        System.out.println(lc.isOrder("word","world", order1));
//        lc.isAlienSorted(words,order);
    }
}
