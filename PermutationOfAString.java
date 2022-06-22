import java.util.ArrayList;
import java.util.Scanner;
public class PermutationOfAString {
    static ArrayList<String> perm(String name){
        if(name.length() == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        char singleChar = name.charAt(0);
        String subString = name.substring(1);
        ArrayList<String> result = perm(subString);
        ArrayList<String> finalResult = new ArrayList<>();
        for(String s: result)
        {
            for(int i=0; i<s.length(); i++)
            {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, singleChar);
                finalResult.add(sb.toString());
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println(perm(str));
        sc.close();
    }
}