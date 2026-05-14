class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> l1 = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            while(start < end){
                if(nums[start] + nums[end] == -a){
                    l1.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) start++;
                    while (start < end && nums[end] == nums[end + 1]) end--;
                }
                else if(nums[start] + nums[end] < -a){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return l1;
    }
}