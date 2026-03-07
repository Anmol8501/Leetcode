# Last updated: 3/7/2026, 10:14:29 PM
class Solution:
    def isPalindrome(self,x: int) -> bool:
        if x<0:
            return False
        x=str(x)
        if x==x[::-1]:
            return True 
        else:
            return False
        