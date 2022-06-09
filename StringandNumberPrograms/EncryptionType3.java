import java.util.*;

class EncryptionType3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sentences:");
        int n = sc.nextInt();
        String temp, sub, sent[], Question_5[];
        int i, j, tmp = 0;
        if (n <= 1 || n >= 10)
            System.out.println("INVALID ENTRY");
        else {
            sent = new String[n];
            Question_5 = new String[n];
            System.out.println("Enter " + n + " sentences:");
            for (i = 0; i < n;) {
                tmp = 0;
                temp = sc.nextLine();
                temp = temp.trim();
                temp = temp + " ";
                for (j = 0; j < temp.length() - 1 && i < n; j++) {
                    if (temp.charAt(j) == '.') {
                        sub = temp.substring(tmp, j + 1);
                        tmp = j + 1;
                        sent[i++] = sub;
                    }
                }
            }
            for (i = 0; i < n; i++) {
                if ((i + 1) % 2 == 1) {
                    temp = "";
                    for (j = 0; j < sent[i].length(); j++) {
                        if (sent[i].charAt(j) == 'Y' || sent[i].charAt(j) == 'y' || sent[i].charAt(j) == 'Z'
                                || sent[i].charAt(j) == 'z')
                            temp += (char) (sent[i].charAt(j) - 24);
                        else if (Character.isLetter(sent[i].charAt(j)))
                            temp += (char) (sent[i].charAt(j) + 2);
                        else
                            temp += sent[i].charAt(j);
                    }
                    Question_5[i] = temp.trim();
                } else {
                    sent[i] = sent[i].replace(".", " ") + " ";
                    tmp = 0;
                    temp = "";
                    for (j = 0; j < sent[i].length() - 1; j++) {
                        if (sent[i].charAt(j) == ' ') {
                            temp = sent[i].substring(tmp, j + 1) + temp;
                            tmp = j + 1;
                        }
                    }
                    Question_5[i] = temp.trim() + ".";
                }
            }
            for (i = 0; i < n; i++)
                System.out.println(Question_5[i]);
        }
    }
}