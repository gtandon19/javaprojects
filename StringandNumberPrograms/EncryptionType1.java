
/**
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Write a menu driven program which accepts a text and encrypts it using one of the
following techniques.
Technique 1: SHIFT
The first technique uses a shifting process to hide a message. The value of the shift can
be in the range 1 to 26. For example, a shift of 7 means that
U = A, V = B, W = C, A = G, B = H, Z = F etc.
The given text is first converted to Uppercase. Spaces within the original text are replaced
with QQ, before the text is encrypted with the given shift value. Double Q was selected
because no English word ends in Q or contains QQ. Digits and special characters are
simply converted to $ and @ respectively.
Technique 2: ASCII
In the second encrypting technique, all the characters in the text are converted to their
ASCII values and then reversed.
For example, consider A_z (the underscore is just to highlight the space). The ASCII
values of A,<space>, z are 65, 32, 122 respectively. Concatenate them to get 6532122,
then reverse this to get 2212356 as the coded message. 
 */
import java.util.*;

class EncryptionType1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int shift, i, n;
        String str;
        String str1 = "";
        String str2 = "";
        System.out.println("Enter Choice");
        System.out.println(
                "The first technique uses a shifting process to hide a message. \n The value of the shift can be in the range 1 to 26. \n For example, a shift of 7 means that \n U = A, V = B, W = C, A = G, B = H, Z = F etc. \n ");
        System.out.println(
                "The given text is first converted to Uppercase. \n Spaces within the original text are replacedwith QQ,  \n before the text is encrypted with the given shift value.  \n Double Q was selected because no English word ends in Q or contains QQ. \n  Digits and special characters are simply converted to $ and @ respectively.");
        System.out.println(
                "In the second encrypting technique, all the characters in the text are converted to their ASCII values and then reversed. \n For example, consider A_z (the underscore is just to highlight the space).\nThe ASCII values of A,<space>, z are 65, 32, 122 respectively. \n Concatenate them to get 6532122, then reverse this to get 2212356 as the coded message. ");
        System.out.println("Enter 1 or 2");
        int ch = sc1.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the plaintext");
                str = sc.nextLine();
                str = str.toUpperCase();
                n = str.length();
                char ch1[] = str.toCharArray();
                char ch3, ch4;
                System.out.println("Enter shift");
                shift = sc1.nextInt();
                System.out.println("Encrypted text is");
                for (i = 0; i < n; i++) {
                    if (Character.isLetter(ch1[i])) {
                        ch3 = (char) (((int) ch1[i] + shift - 65) % 26 + 64);
                        str1 = str1 + ch3;
                    } else if (Character.isDigit(ch1[i]))
                        str1 = str1 + "$";
                    else if (ch1[i] == ' ')
                        str1 = str1 + "QQ";
                    else
                        str1 = str1 + "@";
                }
                System.out.println(str1.toUpperCase());
                break;
            case 2:
                System.out.println("Enter the plaintext");
                str = sc.nextLine();
                char ch2[] = str.toCharArray();
                int int2[] = new int[ch2.length];
                String s3 = "";
                for (i = 0; i < ch2.length; i++)
                    str2 = str2 + ((int) ch2[i]);
                for (i = str2.length() - 1; i >= 0; i--)
                    s3 = s3 + str2.charAt(i);
                System.out.println(s3);
                break;
        }
    }
}