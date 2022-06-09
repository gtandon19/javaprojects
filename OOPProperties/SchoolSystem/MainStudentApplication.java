package SchoolSystem;

import java.util.Scanner;

class MainStudentApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student sch = new Student();

        System.out.println("Enter num");
        int size = sc.nextInt();
        Student st[] = new Student[size];
        // declare initialize st

        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();
            st[i].accept();
        }
        Student.insertsort(st);
        for (int i = 0; i < st.length; i++) {
            st[i].display();
        }

    }
}
