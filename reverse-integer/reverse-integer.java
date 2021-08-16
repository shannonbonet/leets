class Solution {
    public int reverse(int x) {
    //     if (x < 10) {
    //         return x;
    //     }
        
        long result = 0;  
        while (x != 0) {
            long curr = x % 10; 
            result = result * 10 + curr; 
            x = x / 10; 
        }
        
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0; 
        }
        return (int)result; 
    } 
}