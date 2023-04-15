class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);

        for (int row = 1; row < numRows; row++) {
            List<Integer> curRow = new ArrayList<>();
            List<Integer> preRow = triangle.get(row - 1);

            curRow.add(1);
            for (int j = 1; j < row; j++) {
                curRow.add(preRow.get(j - 1) + preRow.get(j));
            }
            curRow.add(1);
            triangle.add(curRow);
        }

        return triangle;
    }
}