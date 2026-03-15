# Last updated: 3/15/2026, 9:26:46 PM
class Solution:
    def reverse(self, x: int) -> int:
        sum=0
        while x!=0:
            tmp=x-int(x/10)*10
            sum=sum*10+tmp
            x=int(x/10)
        if sum>(2**31)-1 or sum<-2**31:
            return 0
        return sum