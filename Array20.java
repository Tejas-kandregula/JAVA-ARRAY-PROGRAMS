// aray program to implement arr a = [3,4,3,1,6]
 //3+4 = 1+6 true = 2 else false = -1
import java.util.*;
public class Array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int count=0;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
            count++;
        }
        if(equilibrium(a, count))
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(-1);
        }
    }
    public static boolean equilibrium(int [] a, int count)
    {
        int [] b = new int[count/2];
        int sum = 0;
        for(int i=0;i<=b.length-1;i++)
        {
            b[i] = a[i];
            sum = sum +b[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(a));
        int [] c = new int[count/2];
        int sum2 =0;
        int j=0;
        for(int i=a.length-1;i>a.length/2;i--)
        {
            c[j]= a[i];
            sum2 = sum2 + c[j];
            j++;
        }
        System.out.println(Arrays.toString(c));
        System.out.println(sum2);
        if(sum == sum2)
        {
            return true;
        }
        else
            return false;
    }
    
}
