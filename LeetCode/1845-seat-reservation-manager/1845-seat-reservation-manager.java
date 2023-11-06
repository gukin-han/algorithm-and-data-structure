class SeatManager {
    private TreeSet<Integer> unReservedSeats = new TreeSet<>();
    private boolean[] isTaken;
    
    public SeatManager(int n) {
        for (int i = 1; i <= n ; i++) {
            unReservedSeats.add(i);
        }
        isTaken = new boolean[n + 1];
    }
    
    public int reserve() {
        int seat = unReservedSeats.pollFirst();
        return seat;
    }
    
    public void unreserve(int seatNumber) {
        unReservedSeats.add(seatNumber);
    }
}
