// ARRAY PRODUCT OF EACH ELEMENT IN AN ARRAY
import java.util.Scanner;
import java.util.*;
public class Array10 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int [] b = new int[n];
        for(int i=0;i<=b.length-1;i++)
        {
            b[i] = proOfEachDig(a[i]);
        }
        System.out.println(Arrays.toString(b));
    }
    public static int proOfEachDig(int num)
    {
        int pro = 1;
        while(num>0)
        {
            int digit = num%10;
            pro*= digit;
            num = num/10;
        }
        return pro;
    }
    
}
