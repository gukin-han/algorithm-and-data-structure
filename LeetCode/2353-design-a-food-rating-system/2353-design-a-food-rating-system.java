class FoodRatings {
    Map<String, F> foodToF = new HashMap<>();
    Map<String, TreeSet<F>> map = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            F f = new F(food, cuisine, rating);
            foodToF.put(food, f);
            
            if (!map.containsKey(cuisine)) {
                TreeSet<F> ts = new TreeSet<>();
                ts.add(f);
                map.put(cuisine, ts);
            } else {
                map.get(cuisine).add(f);
            }
        }
        
    }
    
    public void changeRating(String food, int newRating) {
        F f = foodToF.get(food);
        map.get(f.cuisine).remove(f);
        f.rating = newRating;
        map.get(f.cuisine).add(f);
    }
    
    public String highestRated(String cuisine) {
        return map.get(cuisine).first().food;
    }
    
    private class F implements Comparable<F> {
        String food;
        String cuisine;
        int rating;
        
        F (String food,String cuisine, int rating) {
            this.food = food;
            this.cuisine = cuisine;
            this.rating =rating;
        }
        
        @Override
        public int compareTo(F O) {
            if (this.rating == O.rating) return this.food.compareTo(O.food);
            return O.rating - this.rating;
        }
    }
}