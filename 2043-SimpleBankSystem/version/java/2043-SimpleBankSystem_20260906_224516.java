// Last updated: 9/6/2026, 10:45:16 PM
1class Bank {
2    long[] nums;
3    public Bank(long[] balance) {
4        nums = new long[balance.length];
5        nums=balance;
6    }
7    
8    public boolean transfer(int account1, int account2, long money) {
9        if(account1>nums.length || account2>nums.length){
10            return false;
11        }
12        if(nums[account1-1]>=money){
13            nums[account1-1]-=money;
14            nums[account2-1]+=money;
15            return true;
16        }
17        return false;
18    }
19    
20    public boolean deposit(int account, long money) {
21        if(account>nums.length){
22            return false;
23        }
24        else{
25            nums[account-1]+=money;
26            return true;
27        }
28    }
29    
30    public boolean withdraw(int account, long money) {
31        if(account>nums.length){
32            return false;
33        }
34        if(nums[account-1]>=money){
35            nums[account-1]-=money;
36            return true;
37        }
38        return false;
39    }
40}
41
42/**
43 * Your Bank object will be instantiated and called as such:
44 * Bank obj = new Bank(balance);
45 * boolean param_1 = obj.transfer(account1,account2,money);
46 * boolean param_2 = obj.deposit(account,money);
47 * boolean param_3 = obj.withdraw(account,money);
48 */