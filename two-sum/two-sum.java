class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<> (); 
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); //can use .get later
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if (map.containsKey(complement) && i != map.get(complement)) {
                return new int[]{i, map.get(complement)}; 
            }
        }
        return null; 
    }
}

//nums[i] != complement prevents duplicate element values; should prevent duplicate element indices instead 