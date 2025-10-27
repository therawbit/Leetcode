class Solution {
    public int numberOfBeams(String[] bank) {
        int previousDevices = 0;
        int totalLaserBeams = 0;
        for(int i = 0;i<bank.length;i++){
            char[] arr = bank[i].toCharArray();
            int securityDevices = 0;
            for (int j = 0; j< arr.length;j++){
                if(arr[j]=='1'){
                    securityDevices++;
                }
            }
            if(securityDevices>0){
                if(previousDevices > 0){
                     totalLaserBeams += securityDevices*previousDevices;
                previousDevices = securityDevices;
                }else{
                    previousDevices = securityDevices;
                }
               
            }

        }
        return totalLaserBeams;
    }
}
