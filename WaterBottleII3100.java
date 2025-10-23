class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
                int totalConsumed = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange){
            emptyBottles -= numExchange;
            totalConsumed += 1;
            emptyBottles++;
            numExchange ++;
        }
        return totalConsumed;
    }
}
