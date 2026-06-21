class Solution {
  public:
    string chooseSwap(string &s) {
        set<char>st;
        for(char ch : s)
            st.insert(ch);
        char a = '*' , b = '*';
        for(char ch : s){
            if(st.find(ch) == st.end())
                continue;
            else if(ch == *st.begin())
                st.erase(ch);
            else{
                a = *st.begin();
                b = ch;
                break;
            }
        } 
        for(char &ch : s){
            if(ch == a)
                ch = b;
            else if(ch == b)
                ch = a;
        }
        return s;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna