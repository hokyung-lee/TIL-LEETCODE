class Solution {
    Map<String, Integer> result = new HashMap<>();
    
    public List<String> subdomainVisits(String[] cpdomains) {
        for (String cpdomain : cpdomains) {
            exec(cpdomain);
        }
        
        List<String> finalResult = new ArrayList<>();
        
        for(Map.Entry<String, Integer> e : result.entrySet()) {
            finalResult.add(e.getValue() + " " + e.getKey()); 
        }
        
        return finalResult;

    }
    
    private void exec(String cpdomain) {
        String[] seperatedCpdomain = cpdomain.split(" ");
        
        int visitCount = Integer.parseInt(seperatedCpdomain[0]);
        String[] seperatedDomain = seperatedCpdomain[1].split("\\.");
        
        calculateVisitCount(visitCount, seperatedDomain, seperatedDomain.length);
        
    }
    
    private void calculateVisitCount(int visitCount, String[] seperatedDomain, int level) {
        
        List<String> domains = new ArrayList<>();
        
        // Top Level
        String topLevelDomain = seperatedDomain[level-1];
        domains.add(topLevelDomain);
        
        // Second Level
        String secondLevelDomain = seperatedDomain[level-2] + "." + topLevelDomain;
        domains.add(secondLevelDomain);
                
        // Third Level
        if (level==3) { // third level
            String thirdLevelDomain =  seperatedDomain[level-3] + "." + secondLevelDomain;
            domains.add(thirdLevelDomain);
        }
        
        for (String domain : domains) {

            Integer newVisitCount = visitCount;
            
            if (result.containsKey(domain)) {
                newVisitCount = newVisitCount + result.get(domain);
            }
            result.put(domain, newVisitCount);   
        }
        
    }
}