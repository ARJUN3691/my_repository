class Solution {
    public static void main(String [] args)
    {
        Solution s=new Solution();
        int n=12;
        System.out.println(s.countDigits(n));
    }
    public int countDigits(int n) {
        int count=0;
        while(n>0)
        {
           n=n/10;
           count++;
        }
        return count;
    }
}
