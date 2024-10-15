// ARRAY PROGRAM TO REVERSE THE WHOLE ARRAY
import java.util.*;
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int x = a.length-1;
        for(int j=0;j<=b.length-1;j++)
        {
            b[j] = a[x];
            x--;
        }
        System.out.println(Arrays.toString(b));
    }
   
    
}
