class Solution {
    public static void main(String [] args)
    {
        int[] arr={54,43,2,1,5};
        System.out.println(arraySum(arr));
    }
    public static int arraySum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];   
        }
        return sum;
        
    }
}
