class Solution {
    static class Freq {
        char key;
        int value;
        Freq(char key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        // 1. Count frequencies of each character
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        // 2. Max-heap to process characters in descending lexicographical order
        PriorityQueue<Freq> pq = new PriorityQueue<>((a, b) -> b.key - a.key);
        for (char ch : hm.keySet()) {
            pq.add(new Freq(ch, hm.get(ch)));
        }
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            Freq top = pq.poll();  
            // If the count is within the limit, append all of them
            if (top.value <= repeatLimit) {
                for (int i = 0; i < top.value; i++) {
                    ans.append(top.key);
                }
            } else {
                // If it exceeds the limit, append exactly 'repeatLimit' times
                for (int i = 0; i < repeatLimit; i++) {
                    ans.append(top.key);
                }
                top.value -= repeatLimit;
                // CRITICAL STEP: We need a separator character to break the streak
                if (!pq.isEmpty()) {
                    Freq next = pq.poll();
                    ans.append(next.key); // Append exactly ONE separator character
                    next.value -= 1;
                    // Put the separator back if it still has remaining count
                    if (next.value > 0) {
                        pq.add(next);
                    }
                    // Put the original top character back to continue processing
                    pq.add(top);
                } else {
                    // No other character is available to break the streak, so we must stop
                    break;
                }
            }
        }
        return ans.toString();
    }
}