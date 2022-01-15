package LeetCode_Random;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }
}
