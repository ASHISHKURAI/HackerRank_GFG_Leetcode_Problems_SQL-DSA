class Solution {
    public static int largest(int[] arr) {
        // code here
        int n= arr.length;
        int max = arr[0];     // assuming the first element is the max element 
        
        for (int i=0; i<n; i++){  // travesing the array 
            
            if (arr[i]> max){  // condition
                
                max=arr[i];    // max value storing 
            }
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna