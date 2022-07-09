public class EditDistanceProblem {
    static int editDistanceOperationCount(String first, String second, int m, int n)
    {
        if(m == 0)
        {
            return n;
        }
        if(n == 0)
        {
            return m;
        }
        if(first.charAt(m-1) == second.charAt(n-1))
        {
            return editDistanceOperationCount(first, second, m-1, n-1);
        }
        int insert = editDistanceOperationCount(first, second, m, n-1);
        int delete = editDistanceOperationCount(first, second, m-1, n);
        int replace = editDistanceOperationCount(first, second, m-1, n-1);
        int min = Math.min(Math.min(insert, delete), replace);
        return min+1;
    }
    public static void main(String[] args) {
        String first = "Saturday";
        String second = "Sunday";
        System.out.println(editDistanceOperationCount(first, second, first.length(), second.length()));
    }
}
