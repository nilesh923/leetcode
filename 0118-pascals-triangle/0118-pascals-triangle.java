class Solution {
    public List<List<Integer>> generate(int numRows) {
        //created a new array list of 2d 
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //usma 0 index pe ekk new arrayList baniye hai
        result.add(new ArrayList<Integer>());
        //woh index access kr ka 1 add kr diya hai uski first index always 1 hoga
        result.get(0).add(1);
        // next index ma jo 1st and 2nd index hoga left most and right most ko chor ka waha sum aaya ga usko phele ek temp arrayList ma store kara ga taki last ma result ma addd kr da aur haa jo array bana ga uska left and most toh 1 hi hoga
        
        for(int i=1;i<numRows;i++){
            //result.add(1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> prevArray = result.get(i-1);
            for(int ii = 1; ii<i;ii++){
                temp.add(prevArray.get(ii)+ prevArray.get(ii-1));
            }
            temp.add(1);
            result.add(temp);

            
        }
    return result;
    }
}