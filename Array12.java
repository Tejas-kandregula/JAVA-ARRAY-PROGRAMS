// ARRAY PROGRAM FOR N RIGHT ROTATIONS
import java.util.*;
public class Array12 {
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
            int temp = a[0];
            for(int i=0;i<=a.length-2;i++)
            {
                a[i] = a[i+1];
            }
            a[a.length-1] = temp;
           }
           System.out.println(Arrays.toString(a));
    }
}
