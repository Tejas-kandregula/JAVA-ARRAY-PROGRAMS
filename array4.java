// ARRAY PROGRAM TO ADD EACH ELEMENT
import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum + sumOf(a[i]);
        }
        System.out.println(sum);      
    }
    public static int sumOf(int num)
    {
            int sum =0;
            while (num>0) {
            int dig = num%10;
            sum = sum + dig;
            num = num/10;
            }
            return sum; 
    }
    
}
