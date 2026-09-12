import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] arr) {

        int[] temp = arr.clone();

        Arrays.sort(temp);

        int n = arr.length;

        int left = (n - 1) / 2;
        int right = n - 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                arr[i] = temp[left];
                left--;
            } 
            else {
                arr[i] = temp[right];
                right--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna