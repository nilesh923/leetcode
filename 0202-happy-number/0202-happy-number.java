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