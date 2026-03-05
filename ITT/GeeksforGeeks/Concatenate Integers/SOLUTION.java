import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Your Code to Concatenate and print
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        String s=s1+s2;
        int c=Integer.parseInt(s);
        
        System.out.println(c);
    }
}
