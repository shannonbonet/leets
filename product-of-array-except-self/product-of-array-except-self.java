class Solution {
    public int[] productExceptSelf(int[] nums) {
        // using division operation, first get product of all indices, then divide out i 
//         int[] answer = new int[nums.length]; 
//         int product = 1; 
//         for (int i = 0; i < nums.length; i++) {
//             product *= nums[i]; 
//         }
        
//         for (int i = 0; i < nums.length; i++) {
//             answer[i] = product / nums[i];
//         }
//         return answer; 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // not using division
        int[] prodArray = new int[nums.length]; 
        // create forward + backward arrays -> combine sums 
        // key insight: if going foward, the left over product sums will in the backwards array! 
        // why does this work / correctly leave out i? 
            // first indice is initialized as 1 
        
        int[] forward = new int[nums.length]; 
        forward[0] = 1; 
        for (int i = 1; i < nums.length; i++) {
            forward[i] = forward[i - 1] * nums[i - 1];
        }
        
        int[] backward = new int[nums.length]; 
        backward[nums.length - 1] = 1; 
        for (int i = nums.length - 2; i >= 0; i--) {
            backward[i] = backward[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < nums.length; i++) {
            prodArray[i] = forward[i] * backward[i]; 
        }
        return prodArray; 
    }
}

//naive solution: create product array; traverse nums twice o(n^2) 

//java: only have to call length() on array types. object .length exists on int types