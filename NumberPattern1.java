public class NumberPattern1 {
    static void pattern(int row, int n, int nums){
        if(row > n){
            return ;
        }
        print(row, nums);
        System.out.println();
        pattern(row+1, n, ++nums);
    }
    static void print(int noOfNums, int num){
        if(noOfNums == 0)
        {
            return;
        }
        System.out.print(num + " ");
        print(noOfNums-1, num);
    }
    public static void main(String[] args) {
        int row = 1, n = 5, nums = 1;
        pattern(row, n, nums);
    }
}
