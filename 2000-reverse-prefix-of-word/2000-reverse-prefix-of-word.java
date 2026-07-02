class Solution {
    public String reversePrefix(String word, char ch) {
    int count=0;
    String npop ="";
    int index = word.indexOf(ch);
    if(index == -1)
    return word;
    Stack<Character> stack = new Stack<>();
        for(int i=0;i<word.length();i++){
            stack.push(word.charAt(i));
            if(word.charAt(i) == ch){
                count=i+1;
                break;
            }
        
        }
        
    while(!stack.isEmpty()){
            npop += stack.pop();
        }
    npop = npop + word.substring(count);
    return npop;
    }
}