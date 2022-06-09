/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Caesar Cipher is an encryption technique which is implemented as ROT13 (rotate by 13 places). It is a simple letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, with the other characters remaining unchanged.
Write a program to accept any piece of text and encrypt it using the above technique and give the output as shown in the sample below.
Sample Input:
Hello! How are you? Encryption helps to secure data. Output:
No:of Sentences : 3
Total No.of Words: 9
No.of Characters (with spaces) : 52
No.of Characters (without counting the spaces) : 44 Encrypted Text
Uryyb! Ubj ner lbh? Rapelcgvba Urycf gb frpher gngn.
 */

import java.util.*;

public class EncryptionType2CaesarCypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here:");
        String str = sc.nextLine() + " ";
        String newstr = "";
        int cntwords = 1;
        int cntspc = 0;
        int cntsent = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                char ch1 = (char) (ch + 13);
                if (ch1 > 'Z' && Character.isUpperCase(ch) || ch1 > 'z' && Character.isLowerCase(ch))
                    ch1 -= 26;
                newstr += ch1;
                continue;
            }
            if (ch == ' ' && str.charAt(i + 1) != ' ')
                cntwords++;
            else if (ch == ' ')
                cntspc++;
            else if (ch == '!' || ch == '?' || ch == '.')
                cntsent++;
            newstr += ch;
        }
        System.out.println(newstr);
        System.out.println("No of Sentences=" + cntsent);
        System.out.println("No of Words=" + cntwords);
        System.out.println("No of Char w spaces=" + (str.length() - 1));
        System.out.println("No of Char w/o spaces=" + (str.length() - 1 - cntspc));
    }
}