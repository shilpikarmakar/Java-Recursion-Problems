import java.util.ArrayList;

public class DiagonalMazePathProblem {
    static ArrayList<String> MazePath(int currentRow, int currentCol, int endRow, int endCol){
        if((currentRow == endCol) && (currentCol == endCol)){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if((currentRow > endRow) || (currentCol > endCol)){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        ArrayList<String> hResult = MazePath(currentRow, currentCol+1,endRow, endCol);
        for (String string : hResult) {
            finalResult.add("H" + string);
        }
        ArrayList<String> vResult = MazePath(currentRow+1, currentCol, endRow, endCol);
        for (String string : vResult) {
            finalResult.add("V" + string);
        }
        ArrayList<String> dResult = MazePath(currentRow+1, currentCol+1, endRow, endCol);
        for (String string : dResult) {
            finalResult.add("D" + string);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(MazePath(0, 0, 2, 2));
    }
}
