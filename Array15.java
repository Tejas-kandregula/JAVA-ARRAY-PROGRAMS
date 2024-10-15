// ARRAY PROGRAM TO MOVE ALL ZEROES TO LEFT
import java.util.*;
public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int [] a = new int[n];
           for(int i=0;i<=a.length-1;i++)
           {
               a[i] = sc.nextInt();
           }
           for(int i=0;i<=a.length-1;i++)
           {
            if(a[i]==0)
            {
               int temp=0;
               for(int j=0;j<=a.length-1;j++)
               {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
               }
           }
        }
            System.out.println(Arrays.toString(a));
    }

    
}
