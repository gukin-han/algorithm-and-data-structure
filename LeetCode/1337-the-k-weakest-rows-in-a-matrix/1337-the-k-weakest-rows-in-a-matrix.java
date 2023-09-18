class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Soldiers> list = new ArrayList<>();
        for (int i = 0; i < mat.length ;i++) {
            list.add(new Soldiers(mat[i], i));
        }
        Collections.sort(list);
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i).index;
        }
        
        return answer;
        
    }
    
    private class Soldiers implements Comparable<Soldiers> {
        int[] row;
        int index;
        int numOfSoliders = 0;
        
        public Soldiers(int[] row, int index) {
            this.row = row;
            this.index = index;
            
            for (int i = 0; i < row.length; i++) {
                if (row[i] == 1) this.numOfSoliders++; 
            }
            
        }
        
        @Override
        public int compareTo(Soldiers o) {
            if (this.numOfSoliders != o.numOfSoliders) {
                return Integer.compare(this.numOfSoliders, o.numOfSoliders);
            } else {
                return this.index - o.index;
            }
        }
    }
}