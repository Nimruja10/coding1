import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int cases = 1; cases <= t; cases++)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }

            if(n == 1)
            {
                System.out.println("YES");
                continue;
            }

            int i, prevsum = 0;
            for(i = 0; i < n - 1; i++)
            {
                sum = sum - a[i];
                if(sum == prevsum)
                {
                    System.out.println("YES");
                    break;
                }
                prevsum = prevsum + a[i];
            }

            if(i == n - 1)
            {
                if(sum == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
