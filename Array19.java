// Problem Statement –

// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

// Example 1 :
// N=8 and arr = [4,5,0,1,9,0,5,0].
// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

// Input :
// 8  – Value of N
// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

// Output:

// 4 5 1 9 5 0 0 0
import java.util.*;
public class Array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=1;i<=a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                int temp =0;
                if(a[j]==0)
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            
        } 
       System.out.println(Arrays.toString(a)); 
      for(int i=0;i<=a.length-1;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
    
}