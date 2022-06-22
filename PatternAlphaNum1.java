public class PatternAlphaNum1 {
    static void alphaNUm(int n, int row) {
        if (row > n)
            return;
        printStar(row, 'A');
        System.out.println();
        alphaNUm(n, row + 1);
    }

    static void printStar(int numOfChars, char ch) {
        if (numOfChars == 0)
            return;
        System.out.print(ch + " ");
        printStar(numOfChars - 1, ++ch);
    }

    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        alphaNUm(n, row);
    }
}