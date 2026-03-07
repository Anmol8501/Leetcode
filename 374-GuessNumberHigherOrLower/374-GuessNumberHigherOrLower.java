// Last updated: 3/7/2026, 10:13:11 PM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1,end=n;
        while(start<=end){
            int pic=start+(end-start)/2;
            if(guess(pic)==-1) end=pic-1;
            else if(guess(pic)==1) start=pic+1; 
            else return pic;
        }
        return 0;
    }
}