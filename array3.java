// ARRAY PROGRAM TO GET SUM OF ELEMENTS

import java.util.*;
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        } 
        System.out.println(sumOf(a));
    }
    public static int sumOf(int[] a)
    {
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum +a[i];
        }
        return sum;
    }
    
}
