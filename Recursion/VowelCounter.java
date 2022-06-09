/* Simple program to count the number of vowels string recursively. */
public class VowelCounter {
    // to check if vowel
    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }

    // to count total number of vowel from 0 to n
    static int VowelCounter(String str, int n) {
        if (n == 1)
            return isVowel(str.charAt(n - 1));
        return VowelCounter(str, n - 1) + isVowel(str.charAt(n - 1));
    }

    public static void main() {
        String str = "How many vowels here?";
        System.out.println(VowelCounter(str, str.length()));
    }
}