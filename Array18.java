// ARRAY PROGRAM TO PRINT ONLY POSTIVE ELEMENTS IN AN ARRAY
import java.util.Scanner;
import java.util.*;
public class Array18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int [] a = new int[n];
           for(int i=0;i<=a.length-1;i++)
           {
               a[i] = sc.nextInt();
           }
           System.out.println(Arrays.toString(postiveElements(a,countEle(a))));
}
    public static int countEle(int []a)
    {
        int count=0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]>0)
            {
                count++;
            }
        }
        return count;
    }
    public static int[] postiveElements(int [] a,int count)
    {
        int n = count;
        int [] b = new int[n];
        int index =0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]>0)
            {
                b[index] = a[i];
                index++;
            }
        }
        return b;

    }
}
