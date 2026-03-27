import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<k)
            {
             sum+=arr[i];
            }
            else
            {
                sum+=arr[i];
            }
            if(sum==k)
            {
                System.out.println("Array has two elements with given sum"+" "+sum);
            }
          }
        
        System.out.println("Array doesn't have two elements with given sum"+" "+sum);
            
    }
}
