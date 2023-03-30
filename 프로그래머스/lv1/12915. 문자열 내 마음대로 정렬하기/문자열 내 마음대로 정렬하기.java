import java.util.PriorityQueue;

class NewString implements Comparable<NewString> {
    String word;
    char ch;
    
    public NewString (String word, int n) {
        this.word = word;
        this.ch = word.charAt(n);
    }
    
    @Override
    public int compareTo(NewString o) {
        if (this.ch > o.ch) {
                return 1;
            } else if (this.ch < o.ch) {
                return -1;
            } else if (this.ch == o.ch) {
                return this.word.compareTo(o.word);
            }
            return 0;
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        PriorityQueue<NewString> pq = new PriorityQueue<>();
        
        for (int i = 0; i < strings.length; i++) {
            pq.offer(new NewString(strings[i], n));
        }
        int cnt = 0;
        while (!pq.isEmpty()) {
            NewString ns = pq.poll();
            answer[cnt++] = ns.word;
        }
        
        return answer;
    }
}