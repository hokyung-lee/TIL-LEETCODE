class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char ransomArr[] = ransomNote.toCharArray();
        
        ArrayList<Character> list = new ArrayList<>();
        for(char c : magazine.toCharArray()){
            list.add(c);
        }            
            
        for(int i=0; i < ransomArr.length; i++){
            if(list.contains(ransomArr[i])){
                list.remove(list.indexOf(ransomArr[i]));
            } else {
                return false;
            }
        }
        
        return true;
    }
}