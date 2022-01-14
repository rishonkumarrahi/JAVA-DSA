package LeetCode_Random;

//https://leetcode.com/problems/number-of-1-bits/
public class number1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }
}
