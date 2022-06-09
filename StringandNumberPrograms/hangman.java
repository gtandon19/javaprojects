/* This code implements simple hangman, where a word is given and we have to attempt to guess its synonym / meaning.
 * The code says incorrect if the number of letters entered is incorrect.
 * After 5 chances, it tells you the answer.
 */

import java.util.*;

class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = { "timeless", "thought", "breathe", "opinion", "food", "ring", "work", "computers", "logic",
                "question" };
        String meaning[] = { "everlasting", "conscience", "respire", "view", "nutrition", "concentric circle", "joule",
                "Electronic device", "science of reasoning", "clarify" };
        int num = -1;
        while (num < 0 || num > 10)
            num = (int) (Math.random() * 100);

        String str = arr[num];
        System.out.println("Num of letters = " + str.length());
        char[] word = str.toCharArray();
        char[] guess = new char[str.length()];

        for (int i = 0; i < str.length(); i++)
            guess[i] = '_';
        System.out.println(meaning[num]);
        int chances = 0;
        String input;
        while (chances < 5) {
            System.out.println("Take a guess");
            input = sc.nextLine();
            chances++;
            if (input.length() != str.length()) {
                System.out.println("Incorrect!");
                continue;
            }
            if (input.equalsIgnoreCase(str)) {
                System.out.println("Correct!");
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == word[i])
                    guess[i] = word[i];
            }
            System.out.println(guess);

        } // for
        if (chances == 5)
            System.out.println("Incorrect! Word was " + str);

    }// main
}// class