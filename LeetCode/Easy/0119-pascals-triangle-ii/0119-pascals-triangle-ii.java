class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle = new ArrayList<>();
        triangle.add(1);
        if (rowIndex == 0) {
            return triangle;
        } else if (rowIndex == 1) {
            triangle.add(1);
            return triangle;
        } 

        for (int i = 0; i < rowIndex; i ++) {
            triangle.add(1);
            for (int j = triangle.size() - 3 ; j >= 0; j--) {
                triangle.set(j+1, triangle.get(j+1) + triangle.get(j));
            }
        }

        return triangle;
    }
}