class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
      HashMap<String, PriorityQueue<String>> graph = new HashMap<>();
        for (var ticket : tickets){
            graph.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            graph.get(ticket.get(0)).offer(ticket.get(1));
        }
        List<String> path = new ArrayList<>();
        builtItn("JFK", graph, path);
        return path;
    }

   
    void builtItn(String src, HashMap<String, PriorityQueue<String>> graph, List<String> path) {
        PriorityQueue<String> airports = graph.get(src);

        while (airports != null && !airports.isEmpty()) {
            builtItn(airports.poll(), graph, path);
        }
        path.add(0, src);
    }    
}