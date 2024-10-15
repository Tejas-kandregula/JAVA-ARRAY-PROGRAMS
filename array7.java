// ARRAY PROGRAM TO ADD EXTRA ELEMENT
import java.util.*;
public class array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("add a value to add extra element");
        int [] b = new int[n+1];
        // b[b.length-1] = sc.nextInt();
        // for(int i=0;i<=a.length-1;i++)
        // {
        //     b[i] = a[i];
        // } for last digit add

        // to add extra element at 1st digit
        b[0] = sc.nextInt();
        int x=0;
        for(int i=1;i<=b.length-1;i++)
        {
            b[i] = a[x];
            x++;
        }
    
        System.out.println(Arrays.toString(b));
        
    }
    
}
