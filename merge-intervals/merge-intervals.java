class Solution {
    public int[][] merge(int[][] intervals) {
        
        //for each interval, sort by the first column 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        
        //cannot create dynamically changing Arrays 
        //frequent changes -> LinkedList; frequent retrival -> ArrayList 
        LinkedList<int[]> list = new LinkedList<> (); 
        for (int[] i : intervals) {
            
            if (list.isEmpty() || list.getLast()[1] < i[0]) {
                list.add(i);
            } else { //automatically starts on second item 
                list.getLast()[1] = Math.max(i[1], list.getLast()[1]);
            }
                
            // for (int j = i + 1; j < intervals.length; j++) {
            //     int[] b = intervals[j]; 
            //     if (b[0] <= a[1]) {
            //         int oldA = list.getLast()[0]; 
            //         list.removeLast(); 
            //         list.add(new int[]{Math.min(a[0], oldA), Math.max(a[1], b[1])});
            //     } 
            // }
        }
        return list.toArray(new int[list.size()][]); 
    }
}