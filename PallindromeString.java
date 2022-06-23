import java.util.*;
public class PallindromeString {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) 
        {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1))
        {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
        sc.close();
    }
}
