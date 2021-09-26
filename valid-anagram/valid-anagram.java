class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = t.toCharArray();
        
        List<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        
        for (int i=0; i < arr.length; i++) {
            int index = list.indexOf(arr[i]);
            if (index == -1) {
                return false;
            }
            list.remove(list.get(index));
        }
        
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }
}