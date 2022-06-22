public class NumberPattern2 {
    static void pattern(int row, int n){
        if(row > n){
            return;
        }
        print(row, 1);
        System.out.println();
        pattern(row+1, n);
    }
    static void print(int noOfNums, int num){
        if(noOfNums == 0)
        {
            return;
        }
        System.out.print(num + " ");
        print(noOfNums-1, ++num);
    }
    public static void main(String[] args) {
        int n = 5, row = 1;
        pattern(row, n);
    }
}
