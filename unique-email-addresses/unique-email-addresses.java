class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> forwardedEmail = new HashSet<>();
        for (String email : emails) {
            String[] splitEmails = email.split("@");
            String domainName = splitEmails[1];
            String localName = getLocalName(splitEmails[0]);
            forwardedEmail.add(localName + "@" + domainName);
        }
        
        return forwardedEmail.size();
    }
    
    private String getLocalName(String localName) {
        return localName.replace(".","").split("\\+")[0];
    }
}