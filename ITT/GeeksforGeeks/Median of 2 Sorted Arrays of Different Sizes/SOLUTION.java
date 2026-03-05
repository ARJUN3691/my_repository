class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int l=a.length+b.length;
        int[] c = new int[l];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        int j=0;
        for(int i=a.length;i<l;i++){
            c[i]=b[j];
            j++;
        }
          Arrays.sort(c);
        if(c.length%2==0){
            int m = c.length/2;
            double result =(double) (c[m]+c[m-1])/2;
            return result;
        }
        else{
           int result = c.length/2;
           double median = c[result];
            return median;
        }
             
    }
}
