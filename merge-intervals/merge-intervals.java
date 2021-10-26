class Solution {
    public int[][] merge(int[][] intervals) {
        //for each interval, sort by the first column 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        
        //cannot create dynamically changing Arrays 
        //frequent changes -> LinkedList; frequent retrival -> ArrayList 
        LinkedList<int[]> list = new LinkedList<>(); 
        
        //iterate through itervals --> merge overlapping intervals 
        for (int[] interval : intervals) {
            if (list.isEmpty() || list.getLast()[1] < interval[0]) {
                list.add(interval); 
            } else {
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]); 
            }
        }
        return list.toArray(new int[list.size()][]); 
    }
}