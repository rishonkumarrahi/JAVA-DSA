package Arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EveNumberDigits {
    public int findNumbers(int[] nums) {
        int total = 0;
        int digitCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            while (currentValue != 0) {
                digitCount++;
                currentValue = currentValue / 10;
            }
            if (digitCount % 2 == 0)
                total++;
            //reset the value
            digitCount = 0;
        }
        return total;
    }
}
