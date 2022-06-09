import java.util.Scanner;

public class EncodeDecodeP2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            } // stores all elements in the array by counting the words first
        }
        String N[] = new String[c + 1];
        int j = 0, k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                N[j] = s.substring(k, i);
                k = i + 1;
                j++;
            } // elements stored
        }
        N[c] = s.substring(k, s.length());
        System.out.println("position to delete");
        int n = sc.nextInt();
        N[n - 1] = "";// position to delete replaced by void space
        for (int i = 0; i < N.length; i++)
            System.out.print(N[i] + " ");
    }
}