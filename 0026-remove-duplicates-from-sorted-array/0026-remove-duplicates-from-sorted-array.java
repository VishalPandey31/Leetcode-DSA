class Solution {
    public int removeDuplicates(int[] nums) {
        
           if(nums.length == 0){
          return 0;
           }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);

        for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
           ans.add(nums[i+1]);
          
        }else{
            continue;
        }
        }
         for(int i = 0; i < ans.size(); i++){
            nums[i] = ans.get(i);
        }
        return ans.size();
    }
}