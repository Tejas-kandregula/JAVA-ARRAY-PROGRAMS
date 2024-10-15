// ARRAY PROGRAM TO REVERSE THE ELEMENTS
import java.util.*;
public class array6 {
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
            a[i] = revM(a[i]);
        }
        System.out.println(Arrays.toString(a));
        
    }
    public static int revM(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig = num%10;
            sum = sum*10 + dig;
            num = num/10;
        }
        return(sum);

    }
}
