class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] arr = new int[2];  // pehle hi bana liya
        
        int i = 0;
        int j = numbers.length - 1;

        while(i < j){
            int sum = numbers[i] + numbers[j];

            if(sum == target){
                arr[0] = i + 1;
                arr[1] = j + 1;
                return arr;
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }

        return arr; // default (0,0) ya jo bhi raha
    }
}