class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; 
        } 
        String s = String.valueOf(x);
        StringBuilder b = new StringBuilder(s);
        b.reverse(); 
        return s.equals(b.toString()); 
    }
}