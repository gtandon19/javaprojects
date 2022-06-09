package FileClass;

import java.util.*;
import java.io.*;

class File {
    public static void main() throws IOException {
        FileWriter fw = new FileWriter("d:\\names.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String s = " ";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ENTER A STRING");
            s = sc.nextLine();
            if (s.equals("stop") == true)
                break;
            else
                pw.println(s);
        } while (true);
        pw.close();
        bw.close();
        fw.close();

    }
}