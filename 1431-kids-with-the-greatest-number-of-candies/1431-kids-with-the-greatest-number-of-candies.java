class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> extra = new ArrayList<>();
    for(int i=0;i<candies.length;i++){
        int temp = candies[i]+ extraCandies;
        boolean answer = true;
        for(int j=0;j<candies.length;j++){
            if(temp<candies[j] ){
                answer=false;
            }
        }
        extra.add(answer);
    }
    return extra;
    }
}