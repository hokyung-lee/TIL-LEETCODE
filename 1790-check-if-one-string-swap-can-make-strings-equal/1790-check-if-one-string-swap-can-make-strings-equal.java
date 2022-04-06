class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        
        int unmatchCount = 0;
        int firstIndex = -1;
        int secondIndex = -1;
        String firstCharacter = "";
        String secondCharacter = "";
        for (int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                    firstCharacter = String.valueOf(s1.charAt(i));
                } else if (secondIndex == -1) {
                    secondIndex = i;
                    secondCharacter = String.valueOf(s1.charAt(i));
                }
                unmatchCount++;
            }
        }
        
        if (unmatchCount != 2) return false;

        StringBuilder sb = new StringBuilder();
        for (int j=0; j<s2.length(); j++) {
            if (firstIndex == j) {
                sb.append(secondCharacter);
            }
            else if (secondIndex == j) {
                sb.append(firstCharacter);
            }
            else {
                sb.append(String.valueOf(s2.charAt(j)));
            }
        }
        
        if (s2.equals(sb.toString())) return true;
        return false;
    }
}