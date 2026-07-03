class Solution {
    public int[] plusOne(int[] digits) {
        int arr  =digits.length-1;

        for(int i=arr;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
          return digits;
    }
digits[i]=0;
   
}

int ans[]=new int[digits.length+1];
ans[0]=1;

return ans;
    }

    }
