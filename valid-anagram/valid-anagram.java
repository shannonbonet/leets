class Solution {
    public boolean isAnagram(String s, String t) {
        //check length first 
        if (s.length() != t.length()) {
            return false; 
        }
        //turn strings into character arrays 
        char[] sChar = s.toCharArray(); 
        char[] tChar = t.toCharArray(); 
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        return Arrays.equals(sChar, tChar); 
        
        
        // WRONG: return Arrays.equals(Arrays.sort(sChar), Arrays.sort(tChar)); 
        //cannot sort within equals because sort returns a void type 
        //*think: sort PERFORMS a method on an array; does not produce anything
     
    }
    
}

// remember string methods - better to turn strings into character arrays 
// cannot use HashSet because word could have duplicate letters 
// must call length() on string types 

// basic method: 1) check lengths 2) create arrays 3) sort arrays 4) check equal 
// runtime: n log n bc sorting 