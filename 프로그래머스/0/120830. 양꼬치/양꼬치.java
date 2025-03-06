class Store {
    private static final int lamb = 12000;
    private static final int drink = 2000;
    
    public int totalPrice(int n, int k) {
        int freeDrink = n / 10;
        return (n * lamb) + ((k - freeDrink) * drink);
    }
}


class Solution {
    public int solution(int n, int k) {
        Store store = new Store();
        return store.totalPrice(n,k);
    }
}