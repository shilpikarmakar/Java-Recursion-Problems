import java.util.ArrayList;

public class ClimbingStairs {
    static ArrayList<String> stairs(int currentValue, int endValue){
        if(currentValue == endValue){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(currentValue > endValue){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int i=1; i<=2; i++){
            int newValue = currentValue + i;
            ArrayList<String> result = stairs(newValue, endValue);
            for (String string : result) {
                finalResult.add(string+i);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> answer = stairs(0, 2);
        System.out.println(answer.size());
    }
}
