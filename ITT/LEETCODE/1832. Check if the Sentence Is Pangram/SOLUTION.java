class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<25)
        {
            return false;
        }
        for(char c='a';c<='z';c++)
        {
            if(sentence.indexOf(c)<0)
            {
                return false;
            }
        }
        return true;
        
    }
}
