// Last updated: 9/6/2026, 10:46:51 PM
1class Bank {
2    long[] nums;
3    public Bank(long[] balance) {
4        nums = new long[balance.length];
5        nums=balance;
6    }
7    
8    public boolean transfer(int account1, int account2, long money) {
9        if(account1<=nums.length+1 && account2<=nums.length+1 && nums[account1-1]>=money){
10            nums[account1-1]-=money;
11            nums[account2-1]+=money;
12            return true;
13        }
14        else return false;
15    }
16    
17    public boolean deposit(int account, long money) {
18        if(account<=nums.length+1){
19            nums[account-1]+=money;
20            return true;
21        }
22        else return false;
23    }
24    
25    public boolean withdraw(int account, long money) {
26        if(account<=nums.length+1 && nums[account-1]>=money){
27            nums[account-1]-=money;
28            return true;
29        }
30        else return false;
31    }
32}
33
34/**
35 * Your Bank object will be instantiated and called as such:
36 * Bank obj = new Bank(balance);
37 * boolean param_1 = obj.transfer(account1,account2,money);
38 * boolean param_2 = obj.deposit(account,money);
39 * boolean param_3 = obj.withdraw(account,money);
40 */