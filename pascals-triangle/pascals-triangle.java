class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        // Init
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList());
        result.get(0).add(1);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> preveiousArray = result.get(i-1);
            List<Integer> newArray = new ArrayList<>();
            
            // Left Most
            newArray.add(1);
            
            // Center 
            for (int j=0; j < (i+1)-2; j++) {
                int sum = preveiousArray.get(j) + preveiousArray.get(j+1);
                newArray.add(sum);
            }
            
            // Right Most
            newArray.add(1);
            
            // Set Result
            result.add(newArray);
        }
        
        return result;
    }
}