class Solution {
    public static void main(String [] args)
    {
        int[] arr={1,8,7,56,90};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr) {
        // code here
        if(arr.length==0)
        {
            return -1;
        }
        int ans=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
                
            }
             
        }
        return ans;
        
        
    }
    
}
