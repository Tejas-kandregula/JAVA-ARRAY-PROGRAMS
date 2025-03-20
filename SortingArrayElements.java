import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayElements {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for sorting integers");
        System.out.println("enter 2 for sortinng string elements");
        switch (sc.nextInt()) {
            case 1:
            {
                int n = sc.nextInt();
                int [] a = new int[n];
                for (int i=0;i<=a.length-1;i++)
                {
                    a[i] = sc.nextInt();
                }
                sort(a);
            }  
                break;
            case 2: 
            {
                int n = sc.nextInt();
                String [] a = new String[n];
                for(int i=0;i<=a.length-1;i++)
                {
                    a[i] = sc.next();
                }
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
            }
                break;
            default:
                break;
        }
    }
    public static void sort(int [] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
          
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                  int  temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(a));
    }
  
    
}
