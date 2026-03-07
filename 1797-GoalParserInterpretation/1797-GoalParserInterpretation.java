// Last updated: 3/7/2026, 10:18:48 PM
class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        return command;
    }
}