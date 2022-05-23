class Solution {
    private static final String ch1 = "()";
    private static final String ch2 = "(al)";
    
    public String interpret(String command) {
        return changeCharacter(command);
    }
    
    private String changeCharacter(String command) {
        return command.replace(ch1, "o").replace(ch2,"al");
    }
}