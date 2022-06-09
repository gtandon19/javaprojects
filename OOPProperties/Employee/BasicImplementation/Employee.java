package Employee.BasicImplementation;

import java.util.*;

class Employee {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    DATE obj = new DATE();
    int emp_id;
    String name;
    DATE DOJ;

    public void accept() {
        System.out.println("Enter ID, Name, DOB in integer form");
        emp_id = sc.nextInt();
        name = sc1.nextLine();
        DOJ = new DATE(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    public void sort(Employee[] emparr) {
        for (int i = 0; i < emparr.length; i++) {
            for (int j = 0; j < emparr.length - 1; j++) {
                if (emparr[j].name.compareTo(emparr[j + 1].name) > 1) {
                    Employee temp = emparr[i];
                    emparr[j] = emparr[j + 1];
                    emparr[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        System.out.println(emp_id);
        System.out.println(name);
        DOJ.Dispdate();
    }
}