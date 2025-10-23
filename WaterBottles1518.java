class Solution {
  public int numWaterBottles(int numBottles, int numExchange) {
    int totalConsumed = numBottles;
    int emptyBottles = numBottles;
    while (emptyBottles >= numExchange) {
      int newFullBottles = emptyBottles / numExchange;
      totalConsumed += newFullBottles;
      emptyBottles = newFullBottles + emptyBottles % numExchange;
    }
    return totalConsumed;
  }
}
