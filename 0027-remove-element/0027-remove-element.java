class Solution {
    public int removeElement(int[] nums, int val) {
           ArrayList<Integer> ans = new ArrayList<>();       
        for(int i=0;i<=nums.length-1;i++){
             if(nums[i]==val){
            continue;
             }else{
            ans.add(nums[i]);
                System.out.println(ans.size());
             }
        }
        for (int i = 0; i < ans.size(); i++) {
    nums[i] = ans.get(i);
}
        return ans.size();
    }
}