class Solution {
    public int totalMoney(int n) {
        int numberOfCompleteWeek = n/7;
        int incompleteDays = n % 7;
        int totalMoney = 28 * numberOfCompleteWeek;
        for(int i = 1;i<numberOfCompleteWeek;i++){
            totalMoney += 7*i;
        }
        for(int i = 1;i<=incompleteDays;i++){
            totalMoney += i+numberOfCompleteWeek;
        }
        return totalMoney;
    }
}
