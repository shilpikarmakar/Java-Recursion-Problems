import java.util.ArrayList;

public class MazePathProblem {
    static ArrayList<String> getMazePath(int currentRow, int currentCol, int endRow, int endCol){
        if((currentRow==endRow) && (currentCol==endCol))
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        if((currentRow > endRow) || (currentCol > endCol)){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        ArrayList<String> hResult = getMazePath(currentRow, currentCol+1, endRow, endCol);
        for (String string : hResult) {
            finalResult.add("H"+string);
        }
        ArrayList<String> vResult = getMazePath(currentRow+1, currentCol, endRow, endCol);
        for (String string : vResult) {
            finalResult.add("V"+string);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(getMazePath(0, 0, 2, 2));
    }
}
