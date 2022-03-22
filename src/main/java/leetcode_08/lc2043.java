package leetcode_08;

public class lc2043 {
    static class Bank {
        private long[] banlance;

        public Bank(long[] balance) {
            this.banlance = balance;
        }

        public boolean transfer(int account1, int account2, long money) {
            if(account1 < 1 || account1 > banlance.length || account2 < 1 || account2 > banlance.length)
                return false;
            if(banlance[account1-1] < money)
                return false;
            banlance[account1-1] -= money;
            banlance[account2-1] += money;
            return true;
        }

        public boolean deposit(int account, long money) {
            if(account < 1 || account > banlance.length)
                return false;
            banlance[account-1] += money;
            return true;
        }

        public boolean withdraw(int account, long money) {
            if(account < 1 || account > banlance.length)
                return false;
            if(banlance[account-1] < money)
                return false;
            banlance[account-1] -= money;
            return true;
        }
    }

    public static void main(String[] args) {
         Bank obj = new Bank(new long[]{10, 100, 20, 50, 30});
        System.out.println(obj.withdraw(3, 10));
        System.out.println(obj.transfer(5, 1, 20));
        System.out.println(obj.deposit(5, 20));
        System.out.println(obj.transfer(3, 4, 15));
        System.out.println(obj.withdraw(10, 50));


    }


}
