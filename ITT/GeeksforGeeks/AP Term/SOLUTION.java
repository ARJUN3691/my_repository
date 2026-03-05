class Solution {
    public static void main(String [] args)
    {
        Solution s=new Solution();
        int a=5;
        int d=2;
        int n=5;
        System.out.println(s.apTerm(a,d,n));
    }
    public int apTerm(int a, int d, int n) {
        // code here
        
        int ans =(a+(n-1)*d);

            return ans;
    }
}
