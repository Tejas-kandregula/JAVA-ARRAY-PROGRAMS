/* Print all duplicate elements in an array. */
import java.util.HashSet;
import java.util.Scanner;

public class PrintDuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a = new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
       duplicateElements(a);
    }
    public static void duplicateElements(int[]a )
    {
        HashSet<Integer> unique1 = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for(int i : a)
        {
            if(unique1.contains(i))
            {
                dup.add(i);
            }
            else
            {
                unique1.add(i);
            }
        }
        if(dup.isEmpty())
        {
            System.out.println("No Duplicate elements");
        }
        else
        {
            System.out.println(dup);
        }

    }
    // public static int subArray(int [] a)
    // {
    //     int count=0;
    //     for(int i=0;i<=a.length-1;i++)
    //     {
    //         int ab = a[i];
    //         for(int j=i+1;j<=a.length-2;j++)
    //         {
    //             if(ab==a[j])
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // public static int [] duplicateElements(int [] a)
    // {
    //     int [] b = new int[subArray(a)];
    //     for(int i=0;i<=a.length-1;i++)
    //     {
    //         int bc = a[i];
    //         for(int j=i+1;j<=a.length-2;j++)
    //         {
    //             if(bc==a[j])
    //             {
    //                 for(int k=0;k<=b.length-1;k++)
    //                 {
    //                     b[k]=bc;
    //                 }
                    
    //             }
    //         }
    //     }
    //     return b;
    // }
}
