import java.util.*;
public class LastElementSearchInArray {
    static String search(int a[], int element, int index)
    {
        if(a.length-1 == 0)
        {
            return "Array traversed and element not found";
        }
        if(element == a[index])
        {
            return "Element Found at "+index;
        }
        else
        {
            return search(a, element, index-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int element = sc.nextInt();
        int index = n-1;
        System.out.println(search(a,element,index));
        sc.close();
    }
}
