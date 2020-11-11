import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaturalNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        String Sn = reader.readLine();
        int n = Integer.parseInt(Sn);

        int powN = n * n;                                                 // Number 3 in n ^ 2
        boolean if3InN;
        String poweredN = Integer.toString(powN);
        String three = "3";
        System.out.println(poweredN);
        if3InN = poweredN.contains(three);

        if (if3InN)
            System.out.println("Number 3 in n ^ 2");
        else
            System.out.println("Number 3 is not in n ^ 2");

        System.out.println();
        int lengthN = Sn.length() - 1;                                    // reverse order of string
        char[] arrStr = Sn.toCharArray();

        System.out.println("Reversed order of string is: ");
        for (int i = lengthN; i >= 0; --i)
            System.out.print(arrStr[i]);

        System.out.println();
        System.out.println();
        char temp = arrStr[lengthN];                                      // replace first and last number
        arrStr[lengthN] = arrStr[0];
        arrStr[0] = temp;
        System.out.println("Replaced first and last number: ");
        System.out.println(arrStr);
        System.out.println();

        System.out.println("String with added number 1 in begin and end: "); // add "1" in the end and in the beginning
        System.out.println('1' + Sn + '1');
        }
    }
