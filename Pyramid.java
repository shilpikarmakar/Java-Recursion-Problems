public class Pyramid {
    static void prepareRows(int n, int rows){
        int space = n-rows;
        if(rows > n){
            return;
        }
        printSpace(space);
        printStars(rows);
        System.out.println();
        prepareRows(n, rows+1);
    }
    static void printStars(int noOfStars){
        if(noOfStars == 0){
            return;
        }
        System.out.print("* ");
        printStars(noOfStars-1);
    }
    static void printSpace(int noOfSpace){
        if(noOfSpace == 0){
            return;
        }
        System.out.print(" ");
        printSpace(noOfSpace-1);
    }
    public static void main(String[] args) {
        prepareRows(5, 1);
    }
}
