class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            
            //check duplicates 
            if (i == 0 || nums[i] != nums[i - 1]) { // doesn't check prev of first item 
                
                int low = i + 1, high = nums.length - 1; 
                
                while (low < high) {
                    int sum = nums[low] + nums[high] + nums[i]; 
                    if (sum > 0) {
                        high -= 1; 
                    } else if (sum < 0) {
                        low += 1;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high])); 
                        low += 1;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                    }
                }
            }
        }
        return result; 
    }
}

// [-4, -1, -1, 0, 1, 2]