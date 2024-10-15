// ARRAY PROGRAM TO MERGE THE TWO ARRAYS 
import java.util.Scanner;
import java.util.*;
public class Array16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int [] a = new int[n];
           int [] b = new int[n];
           for(int i=0;i<=a.length-1;i++)
           {
               a[i] = sc.nextInt();
           }
           for(int i=0;i<=b.length-1;i++)
           {
                b[i] = sc.nextInt();
           }
           int [] c = new int[2*n];
           for(int i=0;i<=(c.length-1)/2;i++)
           {
                c[i] = a[i];
           }
           int j=0;
           for(int i=((c.length-1)/2)+1;i<=c.length-1;i++)
           {
                if(j<=4)
                {
                c[i] = b[j];
                j++;
                }
            
           }
           System.out.println(Arrays.toString(c));
    }
    
}
