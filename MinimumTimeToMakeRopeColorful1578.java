class Solution {
    public int minCost(String colors, int[] neededTime) {
        int maxTime = 0;
        char previousChar = ' ';
        int totalTimeForChar = 0;
        int totalTimeNeeded = 0;
        int timesRepeated = 1;
        for(int i =0;i<colors.length();i++){
            char currentChar = colors.charAt(i);
            if(currentChar == previousChar){
                maxTime = Math.max(neededTime[i],maxTime);
                totalTimeForChar += neededTime[i];
                timesRepeated ++;
            }else{
                if(timesRepeated > 1){
                    totalTimeNeeded += totalTimeForChar - maxTime;
                }
                maxTime = neededTime[i];
                totalTimeForChar = neededTime[i];
                timesRepeated = 1;
            }
            previousChar = currentChar;
        
        }
        if(timesRepeated > 1){
            totalTimeNeeded += totalTimeForChar - maxTime;
        }
        return totalTimeNeeded;
    }
}
