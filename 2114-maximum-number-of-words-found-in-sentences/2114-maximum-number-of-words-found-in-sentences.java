class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for(String sentence : sentences) {
            int result = getCountOfWords(sentence);
            
            if (result > max) max = result;
        }
        
        return max;
    }
    
    private static int getCountOfWords(String sentence) {
        return sentence.split(" ").length;
    }
}