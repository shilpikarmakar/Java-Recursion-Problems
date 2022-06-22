import java.util.ArrayList;

public class DiceGameProblem {
    static ArrayList<String> reachToTen(int currentValue, int endValue){
        if(currentValue == endValue)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        if(currentValue > endValue)
        {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice=1; dice<=6; dice++)
        {
            int newValue = currentValue+dice;
            ArrayList<String> result = reachToTen(newValue, endValue);
            for (String s : result) {
                finalResult.add(s+dice);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(reachToTen(0, 10));
    }    
}