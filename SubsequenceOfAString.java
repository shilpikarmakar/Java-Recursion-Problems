import java.util.*;
public class SubsequenceOfAString {
    static ArrayList<String> getSubSequence(String str){
        if(str.length() == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        char singleChar = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> result = getSubSequence(subString);
        ArrayList<String> finalResult = new ArrayList<>();
        for(String s: result)
        {
            finalResult.add(s);
            finalResult.add(singleChar+s);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println(getSubSequence(str));
        sc.close();
    }
}