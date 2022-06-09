
/* Simple program to print the reverse of a string recursively. */
import java.util.Scanner;

public class Reverse {

    public String Reverse() // defaulr constructor
    {
        return "";
    }

    public static String Reverse(String str) {
        if (str.length() == 0)
            return "";
        else
            return str.charAt(str.length() - 1) + Reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        System.out.println(Reverse(str));
    }
}
