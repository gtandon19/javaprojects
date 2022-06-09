import java.util.*;

class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal value:");
        int number = sc.nextInt();
        String bin = "";
        // converting to binary
        System.out.println("Binary equivalent is:");
        for (int x = number; x > 0; x /= 2) {
            bin = (x % 2) + "" + bin; // keeps concatenating the binary digits to string
        }
        System.out.println(bin); // printing binary
        System.out.println("It can be represented as:");
        for (int x = bin.length() - 1, y = 0; x >= 0; x--, y++) {

            if (bin.charAt(x) == '1') { // if the character at the x location is 1, it prints 2^ power
                System.out.print("2^" + y);
                if (x != 0)
                    System.out.print(" + ");
            }
        }
    }
}