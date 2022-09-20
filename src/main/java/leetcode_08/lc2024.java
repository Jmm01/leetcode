package leetcode_08;

public class lc2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0,r=0;
        int max = 0;
        int numF = 0, numT = 0;
        while(r < answerKey.length()){
            if(answerKey.charAt(r) == 'F'){
                numF ++;
            }else
                numT ++;
            while(numF > k && numT > k){
                if(answerKey.charAt(l) == 'F'){
                    numF --;
                }else
                    numT --;
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        lc2024 lc = new lc2024();
        System.out.println(lc.maxConsecutiveAnswers("TTFF", 2));
        System.out.println(lc.maxConsecutiveAnswers("TFFT", 1));

        System.out.println(lc.maxConsecutiveAnswers("TTFTTFTT", 1));

        System.out.println(lc.maxConsecutiveAnswers("T", 1));

    }
}
