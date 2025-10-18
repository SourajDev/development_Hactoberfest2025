class Solution{
    int ans;
    int steppingNumbers(int n, int m){
        ans = 0;
        if(n == 0)
            ans++;
        for(int i = 1; i <= 9; i++)
            find(i, i, n, m);
        return ans;
    }
    
    void find(int prev, int num, int lo, int hi){
        if(num >= lo && num <= hi)
            ans++;
        if(num > hi)
            return;
        if(prev != 0)
            find(prev - 1, num * 10 + prev - 1, lo, hi);
        if(prev != 9)
            find(prev + 1, num * 10 + prev + 1, lo, hi);
    }
}
