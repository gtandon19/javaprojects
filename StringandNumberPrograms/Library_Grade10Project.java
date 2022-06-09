/**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**

Basic guide lines that need to be adhered to for all the Projects
1. Login screen- Accepts the user name and password and verifies the same
with a list that contains 3 user names and their corresponding passwords.
2. The Login screen is to be followed by an appropriate menu.
3. The Menu should be repeatedly displayed as long as the user chooses the
“exit” option.
4. Use “switch case” for testing the menu options.
5. Basic validations related to name, salary, age, gender etc. must be performed
while entering data. For example, name should contain only letters and
numeric data should not be less than 0. Display appropriate error message
and allow the user to enter the data again.
6. Display appropriate error message if the record is not found during search
operations.
7. All the data must be maintained in one dimensional arrays.
8. Appropriate comment lines have to be placed in the program
9. Variable descriptions have to be placed in the end of the program.
10.The first draft of the project should be mailed to your respective teachers on
or before 20th September 2017
11.Names given to variables, classes and functions should be short and
meaningful.
12. Rubrics
Assessment criteria that will be used for evaluation include:
• Class design 10
• Algorithm design 10
• Coding 40
• Documentation 20
• Execution. 20
-----------------------------------------------------------------------------

4. Library Books Management System
Library Management System maintains the Book details and the
Books Issued details (Transactions) in a library.
Following details are maintained for N books:
Book_Code, Title, Author, Publisher, Price and Issued (a Boolean
data type which will be set as true when the book is issued and set as
false when the book is returned).

Following details are maintained regarding the books’ issued:
Book_code, Issue_date, Return_date, Member_Number
Write a menu-driven program to perform the following operations.
a) Search for a Book
Accepts the title of the book and prints the Book details.
(Assume there is only one copy of each title available in the
library)
b) Sorts and Displays the records in the ascending order of the
Title
c) Sorts and Displays the records in the ascending order of
Publisher
d) Search for a Publisher
Accepts the Publisher name and prints the Book details
e) Book Issue
Accepts and stores the following details:
Book_code, Issue_date and return date. Set Issued as True.
f) Accept the Book code that is to be returned and search for it in
the Books issued details. If found, calculate and display the
fine if the book is not returned within a week from the date of
issue. The fine per day is Rs 0.50. (Assume that the book is
returned within the same year)
For option b, c and d display the book details in the format
shown below:
Title Author Publisher Price
 */

import java.util.*;

class Gr10_icse_proj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user[] = { "zero", "one", "three" };
        String pass[] = { "zero", "one", "three" };
        String name, word;
        // Store values of: Book_Code, Title, Author, Publisher, Price and Issued
        /**
         * Everything is in lower capitalization to make it more convenient to compare
         * it in the code later
         */

        int bk_code[] = { 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
        String title[] = { "fall of man", "believers", "awakening", "end of universe", "ms. knowledgeable", "crimson",
                "secret", "social skills" };
        String author[] = { "rupi", "leah", "rick", "christopher", "angela", "edna", "leo", "john" };
        String publisher[] = { "sun", "people", "vikas", "oxward", "nina", "educatethem", "icse publishers",
                "answering" };
        int price[] = { 40, 38, 55, 29, 63, 44, 25, 100 };
        boolean issued[] = { true, false, false, true, true, true, false, true };
        int mnth_brw[] = { 1, 0, 0, 4, 2, 4, 0, 1 };
        int date_brw[] = { 1, 0, 0, 1, 4, 25, 0, 11 };
        int mnth_rtn[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int date_rtn[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int mem_num[] = { 700, 0, 0, 794, 735, 777, 0, 799 };

        while (true) // keeps repeating the loop until user wishes to exit
        {
            int x = 0; // checks numbeer of tries user used to enter use4rname and password
            boolean chk = false; // checks iif the user has been accepted into the code, if username and password
                                 // are right

            while (chk == false && x < 3) // loop to let user enter username and password thrice
            {
                System.out.println("Enter a username:");
                name = sc.nextLine();
                System.out.println("");
                System.out.println("Enter a password: (Case sensitive):");
                word = sc.nextLine();
                System.out.println("");
                for (int j = 0; j < 3; j++) // compares each of the user's entry with correspondents in the arrays
                {
                    if (name.equalsIgnoreCase(user[j]) && word.equals(pass[j])) {
                        chk = true;
                        System.out.println("Logged in as " + user[j].toUpperCase());
                        System.out.println("");
                        System.out.println("Enter your choice from menu:"); // displays menu for user to choose
                        System.out.println("");
                        System.out.println("a. Search for a book");
                        System.out.println("b. Sort the records in ascending order of TITLE");
                        System.out.println("c. Sort the records in ascending order of PUBLISHER");
                        System.out.println("d. Search for a PUBLISHER");
                        System.out.println("e. Issue a book");
                        System.out.println("f. Return a boook");
                        System.out.println("g. Exit");
                        System.out.println("");
                        char ch = sc.next().charAt(0);
                        String input;
                        System.out.println("");
                        switch (ch) {
                            case 'a':
                                System.out.println("Enter the title of the book:");
                                System.out.print("");
                                input = sc.next().toLowerCase();
                                /**
                                 * Ma'am this is the part i was talking about -
                                 * if i put nextLine() it wont let me even enter the value, but next()
                                 * only accepts one worded title
                                 */
                                int found = 0; // checks if title is found in list of arrays, if not,
                                // value remains 0 and displays "Not found in database" via if statement
                                for (int a = 0; a < title.length; a++) {
                                    if (title[a].equals(input.toLowerCase())) {
                                        System.out.println("Title   Author   Publisher   Price");

                                        System.out.print(title[a].toUpperCase() + "   ");
                                        System.out.print(author[a].toUpperCase() + "   ");
                                        System.out.print(publisher[a].toUpperCase() + "   ");
                                        System.out.println(price[a] + "   " + "AED");
                                        System.out.println("Issued? true if yes, false if no: " + issued[a]);
                                        found++;
                                    } // if statement to check entry with array
                                } // outer for loop
                                if (found == 0)
                                    System.out.println("Not found in our database.");
                                break;

                            case 'b':
                                System.out.println("Sort records in arranging order of TITLE:");
                                for (int a = 0; a < title.length; a++) {
                                    String temp;
                                    for (int b = 0; b < title.length; b++) {
                                        if (title[a].trim().charAt(0) < title[b].trim().charAt(0)) {
                                            // compares the 2 words, sorting all the arrays if the second word comes
                                            // before the first

                                            temp = title[a];
                                            title[a] = title[b];
                                            title[b] = temp;

                                            int temp1 = bk_code[a];
                                            bk_code[a] = bk_code[b];
                                            bk_code[b] = temp1;

                                            String temp2 = author[a];
                                            author[a] = author[b];
                                            author[b] = temp2;

                                            String temp3 = publisher[a];
                                            publisher[a] = publisher[b];
                                            publisher[b] = temp3;

                                            int temp4 = price[a];
                                            price[a] = price[b];
                                            price[b] = temp4;

                                            boolean temp5 = issued[a];
                                            issued[a] = issued[b];
                                            issued[b] = temp5;

                                            int temp6 = mnth_brw[a];
                                            mnth_brw[a] = mnth_brw[b];
                                            mnth_brw[b] = temp6;

                                            int temp7 = date_brw[a];
                                            date_brw[a] = date_brw[b];
                                            date_brw[b] = temp7;

                                            int temp8 = date_brw[a];
                                            date_brw[a] = date_brw[b];
                                            date_brw[b] = temp8;

                                            int temp9 = mnth_rtn[a];
                                            mnth_rtn[a] = mnth_rtn[b];
                                            mnth_rtn[b] = temp9;

                                            int temp10 = date_rtn[a];
                                            date_rtn[a] = date_rtn[b];
                                            date_rtn[b] = temp10;

                                            int temp11 = mem_num[a];
                                            mem_num[a] = mem_num[b];
                                            mem_num[b] = temp11;
                                        } // compares one value of array with another
                                    } // inner for loop
                                } // outer for loop
                                System.out.println("Title   Author   Publisher   Price");
                                for (int a = 0; a < title.length; a++) {

                                    System.out.print(title[a].toUpperCase() + "   ");
                                    System.out.print(author[a].toUpperCase() + "   ");
                                    System.out.print(publisher[a].toUpperCase() + "   ");
                                    System.out.println(price[a] + "   ");
                                } // decides what to display
                                break;

                            case 'c':
                                System.out.println("Sort records in arranging order of PUBLISHER :");

                                for (int a = 0; a < title.length; a++) {
                                    String temp;
                                    for (int b = 0; b < title.length; b++) {
                                        if (publisher[a].trim().charAt(0) > publisher[b].trim().charAt(0)) {
                                            temp = publisher[a];
                                            publisher[a] = publisher[b];
                                            publisher[b] = temp;

                                            int temp1 = bk_code[a];
                                            bk_code[a] = bk_code[b];
                                            bk_code[b] = temp1;

                                            String temp2 = author[a];
                                            author[a] = author[b];
                                            author[b] = temp2;

                                            String temp3 = publisher[a];
                                            publisher[a] = publisher[b];
                                            publisher[b] = temp3;

                                            int temp4 = price[a];
                                            price[a] = price[b];
                                            price[b] = temp4;

                                            boolean temp5 = issued[a];
                                            issued[a] = issued[b];
                                            issued[b] = temp5;

                                            int temp6 = mnth_brw[a];
                                            mnth_brw[a] = mnth_brw[b];
                                            mnth_brw[b] = temp6;

                                            int temp7 = date_brw[a];
                                            date_brw[a] = date_brw[b];
                                            date_brw[b] = temp7;

                                            int temp8 = date_brw[a];
                                            date_brw[a] = date_brw[b];
                                            date_brw[b] = temp8;

                                            int temp9 = mnth_rtn[a];
                                            mnth_rtn[a] = mnth_rtn[b];
                                            mnth_rtn[b] = temp9;

                                            int temp10 = date_rtn[a];
                                            date_rtn[a] = date_rtn[b];
                                            date_rtn[b] = temp10;

                                            int temp11 = mem_num[a];
                                            mem_num[a] = mem_num[b];
                                            mem_num[b] = temp11;
                                        } // if statement to compare one vaalue of array with another
                                    } // inner for loop
                                } // outer for loop
                                System.out.println("Title   Author   Publisher   Price");
                                for (int a = 0; a < title.length; a++) {
                                    System.out.print(title[a].toUpperCase() + "   ");
                                    System.out.print(author[a].toUpperCase() + "   ");
                                    System.out.print(publisher[a].toUpperCase() + "   ");
                                    System.out.println(price[a] + "   ");
                                }
                                break;

                            case 'd':
                                System.out.println("Enter the Publisher of the book:");
                                System.out.print("");
                                input = sc.next().toLowerCase();
                                /**
                                 * Ma'am this is the part i was talking about -
                                 * if i put nextLine() it wont let me even enter the value, but next()
                                 * only accepts one worded title
                                 */
                                int found1 = 0; // checks if publisher is found in list of arrays, if not,
                                // value remains 0 and displays "Not found in database" via if statement
                                for (int a = 0; a < title.length; a++) {

                                    if (input.equals(publisher[a])) {

                                        System.out.println("Title   Author   Publisher   Price");
                                        System.out.print(title[a].toUpperCase() + "   ");
                                        System.out.print(author[a].toUpperCase() + "   ");
                                        System.out.print(publisher[a].toUpperCase() + "   ");
                                        System.out.println(price[a] + "AED");
                                        found1++;
                                    } // if statement to check entry with array
                                } // outer for loop

                                if (found1 == 0)
                                    System.out.println("Not found in our database.");

                                break;

                            case 'e': {
                                System.out.println("Issue a book:");
                                System.out.println("Enter the book number:");
                                int numb = sc.nextInt();
                                boolean found3 = false;
                                for (int r = 0; r < bk_code.length; r++) {
                                    if (numb == bk_code[r] && issued[r] == false) {
                                        System.out.println("Enter member number");
                                        mem_num[r] = sc.nextInt();
                                        System.out.println("Enter month of issue (Number:");
                                        mnth_brw[r] = sc.nextInt();
                                        System.out.println("Enter date of issue");
                                        date_brw[r] = sc.nextInt();
                                        issued[r] = true;
                                        System.out.println(
                                                "To be rerturned in 7 days, or fee of 0.5 will be deducted per day!");
                                        found3 = true;
                                    } // if statement to check entry with array
                                } // outer for loop
                                if (found3 == false)
                                    System.out.println("Not found in database");
                            }
                                break;

                            case 'f': {
                                System.out.println("Issue a book:");
                                System.out.println("Enter the book number:");
                                int numb = sc.nextInt();
                                int num_pending = 0,
                                        found2 = 0;
                                for (int r = 0; r < bk_code.length; r++) {
                                    if (numb == bk_code[r] && issued[r] == true) {
                                        System.out.println("Enter month of return (Number):");
                                        mnth_rtn[r] = sc.nextInt();
                                        System.out.println("Enter date of return");
                                        date_rtn[r] = sc.nextInt();
                                        issued[r] = false;
                                        System.out.println("Returned.");
                                        int dayspermonth;
                                        for (int w = mnth_brw[r]; w <= mnth_rtn[r]; w++) {
                                            if (mnth_rtn[r] == 2)
                                                dayspermonth = 28;
                                            else if (mnth_rtn[r] == 4 || mnth_rtn[r] == 6 || mnth_rtn[r] == 9
                                                    || mnth_rtn[r] == 11)

                                                dayspermonth = 30;
                                            else
                                                dayspermonth = 31;

                                            if (w == mnth_rtn[r])

                                                dayspermonth = date_rtn[r] - date_brw[r];
                                            // if books are returned in the same month, then cound only number of days
                                            // left to return
                                            for (int f = 1; f < dayspermonth; f++) {
                                                num_pending++;
                                            }
                                        }
                                        double numpending = num_pending - 7; // reducing first week during which no fine
                                                                             // is to be charged
                                        if (numpending > 0) {
                                            System.out.println("Fees pending = " + (numpending * 0.5));
                                        }

                                    } // if statement to check entry with array
                                    if (found2 != 0)
                                        System.out.println("Not found in database");
                                } // outer for loop
                            } // switch statement to check choice entered
                                break;
                            case 'g':
                                System.exit(0);
                        }
                    } // if statement to check if entry is same
                } // for loop to check each entry
                x++;
            } // loop to enter username and password thrice
            System.out.println("Do you want to continue? - yes or no");
            char cntinue = sc.next().charAt(0);
            if (cntinue == 'n')
                System.exit(0);
            else

                sc.nextLine(); // added because luej skips one line of code when checking

        } // repeating while loop
    } // main()
}// class
