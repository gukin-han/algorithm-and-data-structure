class SeatManager {
    private TreeSet<Integer> unReservedSeats = new TreeSet<>();
    
    public SeatManager(int n) {
        for (int i = 1; i <= n ; i++) {
            unReservedSeats.add(i);
        }
    }
    
    public int reserve() {
        int seat = unReservedSeats.pollFirst();
        return seat;
    }
    
    public void unreserve(int seatNumber) {
        unReservedSeats.add(seatNumber);
    }
}
