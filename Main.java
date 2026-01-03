import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";

        for(int i = 0; i < s.length(); i++)
        {
            int x = s.charAt(i);

            if(x >= 'a' && x <= 'z')
            {
                x = x + 1;
                if(x > 'z')
                    x = 'a';

                char x1 = (char)x;

                if(!(x1 == 'a' || x1 == 'e' || x1 == 'i' || x1 == 'o' || x1 == 'u'))
                    r = r + x1;
            }
            else
            {
                r = r + s.charAt(i);
            }
        }

        System.out.println(r);
    }
}

