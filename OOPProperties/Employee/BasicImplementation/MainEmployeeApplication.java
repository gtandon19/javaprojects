package Employee.BasicImplementation;

import java.util.Scanner;

class MainEmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Employee obj = new Employee();
        System.out.println("Enter num of empls");
        int num = sc.nextInt();
        Employee emp[] = new Employee[num];
        for (int i = 0; i < num; i++) {
            emp[i] = new Employee();
            emp[i].accept();
        }
        obj.sort(emp);
        for (int i = 0; i < emp.length; i++)
            emp[i].display();
    }
}