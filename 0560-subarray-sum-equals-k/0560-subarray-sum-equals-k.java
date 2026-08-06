class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> setcount=new HashMap<>();
        setcount.put(0,1);
        int res=0;
        int prefixsum=0;
        for(int num:nums){
            prefixsum+=num;
            if(setcount.containsKey(prefixsum-k)){
                res+=setcount.get(prefixsum-k);
            }
            setcount.put(prefixsum,setcount.getOrDefault(prefixsum,0)+1);
        }
        return res;
    }
}