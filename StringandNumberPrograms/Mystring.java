/**
 ** Question given by GEMS Modern Academy during preparation of ISC / ICSE Board
 * Exams**
 * Create a class Mystring which has the following public static member
 * functions.
 * Class: Mystring
 * Data Members
 * String st: stores a String
 * Methods:
 * MyString(String s) : constructor to assign the parameter variable to the
 * member variable.
 * void extraspace(): Removes the soft spaces (extra spaces between the words)
 * in the member variable.
 * void checkalpha() : Removes the non-alphabetic characters (except spaces) in
 * the member variable.
 * The resultant string must contain letters and spaces only.
 * 
 */

public class Mystring {
    public static void main(String[] args) {

        String st = "Hi,  I'm So   Tired!!";
        String snew = "";

        for (int x = 0; x < st.length(); x++) {
            if (st.charAt(x) != ' ')
                snew = snew.concat(String.valueOf((st.charAt(x))));
            else if (st.charAt(x) == ' ' && st.charAt(x - 1) != ' ')
                snew = snew.concat(String.valueOf(st.charAt(x)));

        }
        System.out.println(snew);

        String str = "hey";
        str = str.substring(0, 2).concat("llo");
        System.out.println(str);
    }
}
