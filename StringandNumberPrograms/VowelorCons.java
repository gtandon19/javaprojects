
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Accepts a few sentences from the user, and prints the number of vowels and consonants in it.

*/import java.util.Scanner;

public class VowelorCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '?' || n.charAt(i) == '!' || n.charAt(i) == '.')
                c++;
        }
        String b[] = new String[c];
        int j = 0;
        int k = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '?' || n.charAt(i) == '!' || n.charAt(i) == '.') {
                b[j] = n.substring(k, i);
                k = i + 1;
                j++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("Sentence No." + (i+1));
            System.out.println("Vowels:" + vowel(b[i]));
            System.out.println("Word: " + word(b[i]));
        }
        System.out.println();
        System.out.println();
        System.out.print("SCALE: ");
        int scale = sc.nextInt();
        int e[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            e[i] = vowel(b[i]);
        }
        for (int i = 0; i < e.length; i++) {
            for (int w = e[i]; w > 0; w--) {
                for (int t = scale; t > 0; t--) {
                    System.out.print("V");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int vowel(String n) {
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I' || n.charAt(i) == 'O'
                    || n.charAt(i) == 'U')
                c++;
        }
        return c;
    }

    static int word(String n) {
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ')
                c++;
        }
        return (c + 1);
    }
}