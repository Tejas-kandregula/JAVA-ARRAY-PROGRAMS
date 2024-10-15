// ARRAY PROGRAM TO ADD AN ELEMENT AT OUR DESIRED INDEX VALUE
import java.util.*;
public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n+1];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter indeex num");
        int in = sc.nextInt();
        System.out.println("enter index value");
       int c = sc.nextInt(); 
       int x=0;
        for(int i=0;i<=b.length-1;i++)
        {
            if (i==in)
            {
                b[i] = c;
                
            }
            else{
                b[i] = a[x];
                x++;
            }
        }
       System.out.println(Arrays.toString(b)); 
        
    }
    
}
