package LeetCode_Random;

/*
n = 5
101
010

 */
public class ComplementBase10 {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int multi = 1, res = 0;
        while (n != 0) {
            //check current number is 0 or 1
            int currentBinary = (n % 2 == 0) ? 1 : 0;
            n=n/2;
            res = res + currentBinary*multi;
            //for next number
            multi = multi*2;
        }
        return res;
    }
}
