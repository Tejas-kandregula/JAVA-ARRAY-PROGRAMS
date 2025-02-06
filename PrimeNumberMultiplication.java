//  Calculate the multiplication of all prime numbers in a given array.

import java.util.Scanner;

public class PrimeNumberMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a = new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int res = 1;
        for(int i=0;i<=a.length-1;i++)
        {
            if(primeNumber(a[i]))
            {
                res = res*a[i];
            }
        }
        System.out.println(res);
    }
    public static boolean primeNumber(int a)
    {
        boolean q = false;
        int count =0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            q=true;
        }
        return q;
    }
}
