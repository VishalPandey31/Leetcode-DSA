class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
               if(n == 0){
            return true;
        }
        
           for(int i=0;i<arr.length;i++){
        if((i==0 || arr[i-1] ==0 ) && arr[i]==0 && (i==arr.length-1 || arr[i+1]==0 )){
            arr[i]=1;
            n--;
        
    }if(n==0){
    return true;
    }
}

 return false;

}
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna