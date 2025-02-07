/* Sort the prime numbers from two arrays and merge them 
into a single array.  */

import java.util.Scanner;
import java.util.TreeSet;

public class MergingOfTwoPrimeArraysAndSortingIntoSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] a = new int[n1];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] b = new int[n2];
        for(int j=0;j<=b.length-1;j++)
        {
            b[j] = sc.nextInt();
        }
       prime(a, b);
    }
    public static boolean checkPrimeNumber(int a)
    {
        boolean q = false;
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            q = true;
        }
        return q;
    }
    public static void prime(int [] a, int [] b)
    {
        TreeSet<Integer> li = new TreeSet<>();
        for(int num:a)
        {
            if(checkPrimeNumber(num))
            li.add(num);
        }
        for(int num2 : b)
        {
            if(checkPrimeNumber(num2))
            li.add(num2);
        }
        System.out.println(li);
    }
    
}
