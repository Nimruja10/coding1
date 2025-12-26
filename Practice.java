import java.util.*;

class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String s[] = input.split("");
        int ele[] = new int[s.length];

        for(int i = 0; i < ele.length; i++)
            ele[i] = Integer.parseInt(s[i]);

        int sum = 0, i = 0;

        while(i < ele.length)
        {
            if(ele[i] == 5)
            {
                int num2 = 0;

                while(i < ele.length && ele[i] != 8)
                {
                    num2 = num2 * 10 + ele[i];
                    i++;
                }

                if(i < ele.length) // include 8
                {
                    num2 = num2 * 10 + ele[i];
                    i++;
                }

                sum += num2;
            }
            else
            {
                sum += ele[i];
                i++;
            }
        }

        System.out.println(sum);
    }
}
