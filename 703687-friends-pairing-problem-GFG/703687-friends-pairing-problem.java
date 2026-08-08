class Solution {
    public int countFriendsPairings(int n) {
        return solve(n);
    }
    private int solve(int n ){
        if(n<=2)
            return n;
        int res = solve(n-1);
        int pair=(n-1)*solve(n-2);
        
        return (res+pair);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna