class Solution {
    public int maxDigitRange(int[] nums) {
    int digitRange = 0;
    int numm = 0;
    int maxRange = -1;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        int temp = num;
        int minDigit = 9;
        int maxDigit = 0;
        while (temp > 0) {
        int digit = temp % 10;
        if (digit < minDigit)
        minDigit = digit;
        if (digit > maxDigit)
        maxDigit = digit;
        temp /= 10;
        }
        digitRange = maxDigit - minDigit;
        if (digitRange > maxRange) {
        maxRange = digitRange;
        sum = num;
        } else if (digitRange == maxRange) {
                sum = sum + num;

            }

        }
        return sum;
    }
}