import java.util.Scanner;

public class Main
{
    static boolean isNumber(String string)
    {
        return string.matches("^-?\\d+$");
    }
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        float C = 24 % 3;
        float S = 0;

        boolean hasError = false;

        System.out.println("C2 = " + 24 % 2 + ", O1 = '+'.");
        System.out.println("C = C3 = " + C + ".");
        System.out.println("C5 = " + 24 % 5 + ", O2 = '-'.");
        System.out.println("C7 = " + 24 % 7 + ", i and j - 'long'.");

        System.out.print("Enter a: ");
        String strA = myScanner.nextLine();

        System.out.print("Enter n: ");
        String strN = myScanner.nextLine();

        System.out.print("Enter b: ");
        String strB = myScanner.nextLine();

        System.out.print("Enter m: ");
        String strM = myScanner.nextLine();

        if (isNumber(strA) && isNumber(strN) && isNumber(strB) && isNumber(strM))
        {
            long a = Long.parseLong(strA);
            long n = Long.parseLong(strN);
            long b = Long.parseLong(strB);
            long m = Long.parseLong(strM);

            if(a > n || b > m)
            {
                hasError = true;
                System.out.println("Error: Wrong range.");
            }
            else
            {
                for(long i = a; i <= n && !hasError; i++)
                {
                    for(long j = b; j <= m; j++)
                    {
                        if(i == -C)
                        {
                            hasError = true;
                            System.out.println("Error: Division by zero.");
                            break;
                        }
                        else
                        {
                            S += ((i - j) / (i + C));
                        }
                    }
                }
            }
        }
        else
        {
            hasError = true;
            System.out.println("Error: Input is not a number.");
        }

        if(!hasError)
        {
            System.out.println("S = " + S + ".");
        }
    }
}