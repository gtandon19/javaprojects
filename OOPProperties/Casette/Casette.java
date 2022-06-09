package Casette;

/**Declare a class to represent video cassettes in a video library as follows :
Class name : cassette
Data members : sno – serial number
name – name of the cassette
no – number of copies
Methods :
void read( cassette c[ ] ) – to accept information for 10 video cassettes
void display( cassette c[ ] ) – to display the name of the video cassette with the
maximum number of copies.
Write the main program to invoke the class and execute the methods of the class*/

import java.util.*;

class Casette {
    int sno;
    String name;
    int no;

    void read(Casette c[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the details of 10 cassettes ");
        for (int i = 0; i < 10; i++) {
            System.out.println(" Enter the serial no, name and no. of copies ");
            c[i].sno = sc.nextInt();// object referring to the serial number variable
            c[i].name = sc.next();// object in the array referring to the name
            c[i].no = sc.nextInt();// object referring to the number
        }
    }

    void display(Casette c[]) {
        int max = 0, pos = 0;
        for (int i = 0; i < 10; i++) {
            if (c[i].no > max) {
                max = c[i].no;
                pos = i;// to determine the maximum number of cassette
            }
        }
        System.out.println(c[pos].sno + "\t" + c[pos].name + "\t\t" + c[pos].no);// print the name, serial number etc of
                                                                                 // it.
    }
}
