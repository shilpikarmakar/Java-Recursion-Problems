import java.util.*;
public class SumOfDigits {

    static int sum(int n, int s)
    {
        if(n == 0)
        {
            return s;
        }
        else
        {
            s += (n%10);
            return sum(n/10,s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int s = 0;
        int result = sum(n, s);
        System.out.println("The sum of the digits is: " + result);
        sc.close();
    }
}