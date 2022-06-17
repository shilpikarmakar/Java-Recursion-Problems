import java.util.*;
public class ReverseAString {
    static void rev(String s)
    {
        if((s == null) || (s.length() <= 1))
        {
            System.out.print(s);
        }
        else
        {
            System.out.print(s.charAt(s.length()-1));
            rev(s.substring(0, s.length()-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        rev(s);
        sc.close();
    }
}
