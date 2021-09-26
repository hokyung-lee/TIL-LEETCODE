class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        
        for (int i=0; i<ch.length; i++) {
            if (map.containsKey(ch[i])) {
                int index = list.indexOf(ch[i]);
                if (index !=-1) {
                   list.remove(index);
                }
            } else {
                list.add(ch[i]);
                map.put(ch[i], i);   
            }
            
        }
        
        if (list.isEmpty()) {
            return -1;
        }
        return map.get(list.get(0));
    }
}