class Solution {
    
    private static int calculateProductAndSumOfDigits(int n) {
        int productOfDigits = 1; // 곱셉 주의
        int sumOfDigits = 0;
        String convertN = Integer.toString(n);
        
        for (int i=0; i< convertN.length(); i++) {
            productOfDigits *= Character.getNumericValue(convertN.charAt(i));
            sumOfDigits += Character.getNumericValue(convertN.charAt(i));
        }
        
        return productOfDigits - sumOfDigits;
    }
    
    public int subtractProductAndSum(int n) {
        int result = calculateProductAndSumOfDigits(n);
        return result;
    }
}