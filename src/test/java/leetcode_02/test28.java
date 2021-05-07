package leetcode_02;

public class test28 {
    private int sum(int x){
        int sum = 0;
        while(x>0){
            int temp = x%10;
            sum += temp*temp;
            x = x/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = sum(slow);
            fast = sum(fast);
            fast = sum(fast);
        }while(slow != fast);
        
        return slow == 1;
    }

    public static void main(String[] args) {
        test28 t = new test28();
        System.out.println(t.isHappy(19));
    }
}
