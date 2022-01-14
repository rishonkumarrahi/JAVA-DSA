package LeetCode_Random;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class subtractProductSum {
    public int subtractProductAndSum(int n) {
        int Product = 1;
        int sum = 0;
        int ans;
        while(n!=0){
            int lastDigit = n%10;
            Product = Product*lastDigit;
            sum = sum+lastDigit;
            n = n/10;
        }
        ans = Product-sum;
        return ans;
    }
}
