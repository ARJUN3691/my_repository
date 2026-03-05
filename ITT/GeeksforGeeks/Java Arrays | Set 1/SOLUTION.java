
class Solution {
    public static void main(String [] args)
    {
        Solution s=new Solution();
        int[] arr={1,2,3,4,5};
        System.out.println(s.average(arr));
        
    }
    public String average(int arr[]) {
        // code here
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            
            sum+=arr[i];
            
        }
        double avg=sum/arr.length;
        return String.format("%.2f",avg);
        
    }
}
