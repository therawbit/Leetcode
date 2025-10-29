class Solution {
  public int smallestNumber(int n) {
    int power = 0;
    int toAdd = 0;
    int number = n;
    while (number > 0) {
      if (number % 2 == 0) {
        toAdd += Math.pow(2, power);
      }
      power++;
      number = number >> 1;
    }
    return n + toAdd;
  }
}
