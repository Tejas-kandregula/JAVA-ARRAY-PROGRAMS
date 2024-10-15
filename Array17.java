// ARRAY PROGRAM TO SORT THE ELEMENTS IN AN ARRAY
import java.util.Arrays;
import java.util.Scanner;
public class Array17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int [] a = new int[n];
           for(int i=0;i<=a.length-1;i++)
           {
               a[i] = sc.nextInt();
           }
           System.out.println(Arrays.toString(sortArray(a)));
    }
    public static int [] sortArray(int []a)
    {
        for(int i=1;i<=a.length-1;i++)
        {
            for(int j=0;j<=a.length-2;j++)
            {
            if(a[i]<a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
               // index++;
            }
            }
        }
        return a;
    }
    
}
