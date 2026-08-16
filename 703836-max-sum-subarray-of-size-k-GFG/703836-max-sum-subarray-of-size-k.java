class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n= arr.length;

        int windowSum=0;

        for (int i=0; i<k;i++){

            windowSum  +=arr[i];
        }
        int maxAns=windowSum;
        for (int j=k;j<n;j++){

            windowSum +=arr[j];
            windowSum -= arr[j-k];

            maxAns =Math.max(maxAns,windowSum);
        }
        return maxAns;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna