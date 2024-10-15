// PRODUCT OF TWO ARRAY ELEMENTS
import java.util.*;
public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++)
        {
            b[i] = sc.nextInt();
        }
        int [] c = new int[n];
        for(int i=0;i<=c.length-1;i++)
        {
            c[i] = a[i]*b[i];
        }
        System.out.println(Arrays.toString(c));
    }      
}
    

