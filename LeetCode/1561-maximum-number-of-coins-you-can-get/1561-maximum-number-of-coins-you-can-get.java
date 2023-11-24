class Solution {
    public int maxCoins(int[] piles) {
        List<Integer> list = new ArrayList<>();
        for (int pile: piles) {
            list.add(pile);
        }
        Collections.sort(list);

        int result = 0;
        while(!list.isEmpty()) {
            list.remove(list.size() - 1);
            result += list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.remove(0);
        }

        return result;
    }
}