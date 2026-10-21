class Solution {
    public int Sumofsqofdigit(int n) {
        int finall = 0;
        while (n > 0) {
            int nn = n % 10;

            finall = (nn * nn) + finall;
            n = n / 10;

        }
    return finall;
    }

    public boolean isHappy(int n) {
      
      int slow = n;
      int fast = n;
      while(fast!= 1){
        slow = Sumofsqofdigit(slow);
        fast = Sumofsqofdigit(Sumofsqofdigit(fast));
        //agr ma yeh fast ==1 wali line slow == fast wala ka likha ta hu toh dikkat aaya gii n= 10 ka case ma aur haa yeh hum isliye likhna hai kyuki agr fast 1 ho jaat Hi toh hum stop kr da ga na next calcuation nahi kara ga 
        if(fast ==1){
            return  true;
        }
        if(slow == fast){
            return false;
        }
        
      }
    //if(fast == 1)
    return true;}
}