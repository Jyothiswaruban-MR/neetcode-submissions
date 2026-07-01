class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
        String original = clean.toString();
        String reversed = clean.reverse().toString();
        return original.equals(reversed);
    }
}
