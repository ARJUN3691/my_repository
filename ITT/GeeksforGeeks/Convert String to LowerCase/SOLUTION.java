import java.util.Scanner;
class Solution {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println(toLower(s));
    }
    static String toLower(String s) {
        String ss=s.toLowerCase();
        return ss;
        
    }
}
