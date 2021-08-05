class Solution {
    public boolean isValid(String s) {
        //use stack + plain interation; better for runtime 
        Stack<Character> stack = new Stack<Character> (); 
        
        HashMap<Character, Character> types = new HashMap<Character, Character> ();
        types.put(')', '('); 
        types.put(']', '['); 
        types.put('}', '{'); 
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i); 
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); 
            
            //checks closing tags 
            } else if (!stack.isEmpty())  { 
                if (types.get(c) == stack.pop()) {
                    continue; 
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        }
        return stack.isEmpty(); 
    }
}