import java.util.Scanner;

public class stringsetchecker {
    // copy protection code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char ch[] = { 'A', 'C', 'E', 'G', 'I', 'K' };
        boolean g = false;
        int c = 0;
        int k = 0;
        if (n.length() <= 6) {
            for (int i = 0; i < n.length(); i++) {
                c = 0;
                if (Character.isUpperCase(n.charAt(i))) {
                    for (int j = 0; j < ch.length; j++) {
                        if (n.charAt(i) == ch[j]) {
                            c++;
                        }
                    }
                    if (c == 1)
                        k++;
                } else
                    g = false;
            }
        }
        if (k == n.length())
            g = true;
        if (g == true)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}