package LeetCode_Random;
///to check
public class AddBinary {
    public String addBinary(String a, String b) {
        String res = "";
        int i = a.length() - 1 , j = b.length() - 1;
        //add them from back
        //keep two pointer and one carry
        int carry = 0;

        while(i>=0 || j>=0) {
            if(i>=0){
                res += a.charAt(i) - '0';
                i--;
            }
            if(j>=0) {
                res += b.charAt(i) - '0';
                j--;
            }
            res += (carry%2) + '0';
            carry = carry/2;
        }
        //if there is still carry
        if(carry>0) res += 1;

        return res;
    }
}
