class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(0,nums,res,temp);
        return res;
    }
    public static void backtrack(int index,int nums[],List<List<Integer>> res, List<Integer>temp){
        if(index==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        backtrack(index+1,nums,res,temp);
        temp.remove(temp.size()-1);
        backtrack(index+1,nums,res,temp);
    }
}