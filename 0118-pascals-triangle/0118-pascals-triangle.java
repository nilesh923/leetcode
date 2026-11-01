class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
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