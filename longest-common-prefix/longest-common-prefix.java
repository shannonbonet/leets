class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String bestPrefix = ""; 
        if (strs.length == 1) {
            return strs[0]; 
        }
        
        if (strs == null) {
            return ""; 
        }
        
        for (int i = 0; i < strs[0].length(); i++) { //only need to compare to first item 
            char c = strs[0].charAt(i); 
            for (int j = 1; j < strs.length; j++) { //go through remaining items 
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i); 
                }
            }
        }
        return strs[0]; 
    }
}