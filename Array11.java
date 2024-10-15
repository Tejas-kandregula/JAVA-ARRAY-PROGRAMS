// ARRAY PROGRAM FOR N LEFT ROTATIONS
import java.util.Scanner;
import java.util.*;
public class Array11 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        for(int j=1;j<=r;j++)
        {
        int temp = a[a.length-1];
        for(int i=a.length-1;i>=1;i--)
        {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }
    System.out.println(Arrays.toString(a));
    }
}
