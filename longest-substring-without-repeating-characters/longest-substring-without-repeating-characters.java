class Solution {
    public int lengthOfLongestSubstring(String s) {
        // save constructing string 
        // check for duplicates --> stop constructing string 
        // if find another duplicate & string.length < saved string 
        // abcabcbb 
        // abca
        
        // set, index, saved string 
        // abcabcbb
        if (s.length() == 1) {
            return 1; 
        }
        Map<Character, Integer> map = new HashMap<>(); //duplicate, index
        int total = 0; 
        int start = 0; 
        int end = 0; 
        while (end < s.length()) {
            if (map.containsKey(s.charAt(end))) {
                total = Math.max(total, end - start); 
                start = map.get(s.charAt(end)) + 1;
                end = start - 1; // because end++ regardless 
                map.clear(); 
            } else {
                map.put(s.charAt(end), end); 
                total = Math.max(total, end - start + 1); 
            }
            end++;
        }
        return total; 
    }
}

// Wrong - We don't account for 'aa', since Map is <a, 0> and we set start to 0 again. + 1 gives us null pointer exception, so we should 
// Error is we're incrementing end prematurely 
