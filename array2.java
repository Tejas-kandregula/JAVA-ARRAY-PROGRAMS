// ARRAY PROGRAM TO ADD 2 ARRAYS
import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        int [] sum = new int[n];
        for(int i=0;i<=a.length-1;i++ )
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=b.length-1;i++)
        {
            b[i] = sc.nextInt();
        }
        for(int i=0;i<=sum.length-1;i++)
        {
            sum[i] = a[i] + b[i];
        }
        System.out.println(Arrays.toString(sum));
    }
    
}
