import java.util.*;
public class CountNumberOfZeros {
    static int count(int n, int c)
    {
        if(n == 0)
        {
            return c;
        }
        else
        {
            int e = n%10;
            if(e == 0)
            {
                c++;
            }
            return count(n/10, c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int c = 0;
        int result = count(n, c);
        System.out.println("The number of zeros are: " + result);
        sc.close();
    }
}
