class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.offer(s);
        visited.add(s);
        String result = s;
        
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            
            // Update result if we found a smaller string
            if (curr.compareTo(result) < 0) {
                result = curr;
            }
            
            // Operation 1: Add 'a' to all odd indices
            String next1 = addToOddIndices(curr, a);
            if (!visited.contains(next1)) {
                visited.add(next1);
                queue.offer(next1);
            }
            
            // Operation 2: Rotate right by b positions
            String next2 = rotateRight(curr, b);
            if (!visited.contains(next2)) {
                visited.add(next2);
                queue.offer(next2);
            }
        }
        
        return result;
    }
    
    private String addToOddIndices(String s, int a) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            int digit = (chars[i] - '0' + a) % 10;
            chars[i] = (char) (digit + '0');
        }
        return new String(chars);
    }
    
    private String rotateRight(String s, int b) {
        int n = s.length();
        b = b % n; // Handle case where b > n
        return s.substring(n - b) + s.substring(0, n - b);
    }
}