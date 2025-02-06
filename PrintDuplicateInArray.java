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
   
}
