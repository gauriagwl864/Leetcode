class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>hi){
                hi=piles[i];
            }
        }
        while(lo<=hi){
        int mid=lo+(hi-lo)/2;

        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        if (hours <= h) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
        }
    }

       
         