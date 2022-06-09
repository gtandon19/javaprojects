
/*
 * **Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
 */
import java.util.Scanner;

public class EncodeDecodeP1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ENCODED");
        System.out.println("2. DECODED");
        int q = sc.nextInt();
        switch (q) {// switch class to choose menu
            case 1: {
                System.out.println("Enter the Message");
                String msg = sc.next();
                int n = msg.length() - 1;
                String revmsg = "";
                while (n >= 0) {
                    revmsg = revmsg + msg.charAt(n);
                    n--;// this is to reverse the number
                }
                String cod = "";
                for (int i = 0; i < msg.length();) {
                    String m;
                    if (revmsg.charAt(i) == '1') {
                        m = revmsg.substring(i, (i + 3));// to the point where there is one and then substring to
                                                         // convert. because if it begins with one it has to be small
                                                         // case
                        i = i + 3;
                    } else {
                        m = revmsg.substring(i, (i + 2));
                        i = i + 2;// else 2 digit
                    }
                    m = m.trim();// remove blankspace
                    int a = Integer.parseInt(m);
                    cod = cod + (char) a;
                }
                System.out.println(cod);
            }
                break;
            case 2: {
                // Scanner sc = new Scanner(System.in);
                Scanner c = new Scanner(System.in);
                System.out.println("Enter the shift value");
                int s = sc.nextInt();
                System.out.println("Enter the string");
                String str = c.nextLine();
                str = str.toUpperCase();
                String dec = "";
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    int d = ch + s - 1;// the shift in the character added
                    if ((int) d > 90) {
                        d = (d - 26);// if the length exceeds 26, i.e. in case of 'W'
                    }
                    if (i < str.length() - 1 && (char) d == 'Q'
                            && (str.charAt(i + 1) == ('Q' - s + 1) || str.charAt(i + 1) == ('Q' - s + 27))) {// to
                                                                                                             // remove
                                                                                                             // the 'q'
                                                                                                             // which
                                                                                                             // plays as
                                                                                                             // a space
                        d = 32;
                        i++;
                    }
                    if (ch != ' ') {// they are added only if it is not a space
                        dec = dec + (char) d;
                    }
                }
                System.out.println("Decoded string " + dec);
            }
                break;
        }
    }
}