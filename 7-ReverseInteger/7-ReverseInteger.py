# Last updated: 4/28/2026, 8:03:59 PM
class Solution:
    def reverse(self, x: int) -> int:
        abs_x=abs(x)

        rev_x=0
        while abs_x:
            rev_x=10*rev_x+abs_x%10
            abs_x//=10

        if x<0: rev_x=-rev_x

        if rev_x<-2**31 or rev_x>2**31-1:
            return 0

        return rev_x