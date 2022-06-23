public class RopeCut {
    static int countMaxCuts(int ropeLength, int a, int b, int c){
        if(ropeLength == 0){
            return 0;
        }
        if(ropeLength < 0){
            return -1;
        }
        int aCut = countMaxCuts(ropeLength-a, a, b, c);
        int bCut = countMaxCuts(ropeLength-b, a, b, c);
        int cCut = countMaxCuts(ropeLength-c, a, b, c);
        int max = (int)Math.max(aCut, bCut);
        max = (int)Math.max(max, cCut);
        if(max == -1){
            return -1;
        }
        return max+1;
    }
    public static void main(String[] args) {
        System.out.println(countMaxCuts(23, 12, 11, 9));
    }
}
