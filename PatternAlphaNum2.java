public class PatternAlphaNum2 {
    static void pattern(int n, int row, char ch){
        if(row > n){
            return;
        }
        noOfAlphas(row, ch);
        System.out.println();
        pattern(n, row+1, ++ch);
    }
    static void noOfAlphas(int noOfChars, char ch)
    {
        if(noOfChars == 0)
        {
            return;
        }
        System.out.print(ch + " ");
        noOfAlphas(noOfChars-1, ch);
    }
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        pattern(n, row, 'A');
    }
}
