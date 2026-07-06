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


#comment version 
    class Solution {
    public int maxDigitRange(int[] nums) {
    int digitRange = 0; //question ma bol hai isliye digit range mtlb difference nikl raha hai
    //int numm = 0;
    int maxRange = -1; //every elemet ki hum range nikalni hai agr max range jaada hoti hai phele wala element se toh sum reset ho jaya ga and element ki value le le ga agr equal hoti hai toh sum ma add kr da ga
    int sum = 0; //array ki value
    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        int temp = num;// num ki value store due to while loop
        //yaha se hum mini and max value find out kr raha hai hum math function bhi use kr sakta hai na
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
