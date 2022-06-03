class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        
        for(String operation : operations) {
            if (operation.contains("+")) {
                result = result + 1;
            } else {
                result = result - 1;
            }
        }
        
        return result;
    }
}