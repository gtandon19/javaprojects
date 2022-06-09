
/**
 * **Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
A sentence is terminated by either “.”, “!” or “?” followed by a space. 
Input a piece of text consisting of one or more sentences. 
The piece of text may be in uppercase or lowercase. 
The words may be separated by one or more spaces. 
Write a menu driven program that would perform the following operations: 

MENU 
i) Prints the Number of Vowels and Words
ii) Displays each sentence in alphabetical order 
iii) Exit the program 

The menu should be repeatedly displayed and the program should terminate
when the user chooses exit. 
The program should display error message when the user chooses an invalid option. 

Option 1: Prints the number of vowels and number of words in each sentence 
sorted in the descending order of no. of vowels. 

Option 2: Arranges the sentences in alphabetical order of words, 
sentence by sentence and displays each sentence on a separate line. 



Sample Input :
HELLO! HOW ARE YOU? HOPE EVERYTHING IS FINE. BEST OF LUCK.
Output :
i)  Sentence    No. of Vowels.  No. of words
    3           8               4 
    2           5               3 
    4           3               3
    1           2               1
ii) HELLO!
ARE HOW YOU? 
EVERYTHING FINE HOPE IS.
BEST LUCK OF.
 */
import java.util.*;

public class VowelsAndWordsOrAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Enter sentence");
            String str = sc.nextLine() + " ";
            str = sc.nextLine() + " ";
            int cntvow = 0;
            int cntcons = 0;
            System.out.println("MENU:");
            System.out.println("1.Num of vowels in descending order and num of words");
            System.out.println("2. Arrange in alphabetical order of words in separate lines");
            System.out.println("3. Exit");
            opt = sc.nextInt();
            int numwords = 0;
            int sentnum = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
                    numwords++;
                if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == '?')
                    sentnum++;
            }
            if (opt == 1) {
                int arr[] = new int[5];
                char charr[] = { 'a', 'e', 'i', 'o', 'u' };
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
                        arr[0]++;
                    else if (str.charAt(i) == 'e' || str.charAt(i) == 'E')
                        arr[1]++;
                    else if (str.charAt(i) == 'i' || str.charAt(i) == 'I')
                        arr[2]++;
                    else if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                        arr[3]++;
                    else if (str.charAt(i) == 'u' || str.charAt(i) == 'U')
                        arr[4]++;
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (arr[j] < arr[j + 1]) { // bubble sort
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            char ch = charr[j];
                            charr[j] = charr[j + 1];
                            charr[j + 1] = charr[j];
                        }
                    }
                }
                System.out.println("Num of words = " + numwords);
                System.out.println("Num of vowels in decreasing order:");
                for (int i = 0; i < arr.length; i++)
                    System.out.println("The vowel " + charr[i] + " appears " + arr[i] + " times.");
            } else if (opt == 2) {
                int a = 0, b = 0; // keeps traversing the string
                for (int i = 0; i < sentnum; i++) {
                    String temp = "";
                    int numword = 0;
                    temp = temp + String.valueOf(str.charAt(i));
                    b = a;
                    for (; a < str.length() - 1; a++) {
                        if (str.charAt(a) == '?' || str.charAt(a) == '.' || str.charAt(a) == '!')
                            return;
                        if (str.charAt(a) == ' ' && str.charAt(a + 1) != ' ')
                            numword++;
                    }
                    String words[] = new String[numword];
                    for (; b <= a; b++) {
                    }
                }
            }

        } while (opt != 3);
    }
}