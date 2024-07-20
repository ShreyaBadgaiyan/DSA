package patterns;

import java.util.Scanner;

public class classmanual {
    String Emp_name, Mail_id, Address, Emp_id, Mobile_no;
    double BP, GP, NP, DA, HRA, PF, CF;
    Scanner get = new Scanner(System.in);

    void Employee() {
        System.out.println("Enter Name of the Employee:");
        Emp_name = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        Address = get.nextLine();
        System.out.println("Enter ID of the Employee:");
        Emp_id = get.nextLine();
        System.out.println("Enter Mobile Number:");
        Mobile_no = get.nextLine();
        System.out.println("Enter E-Mail ID of the Employee :");
        Mail_id = get.nextLine();
    }

    void display() {
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee Address: " + Address);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Employee Mobile Number: " + Mobile_no);
        System.out.println("Employee E-Mail ID: " + Mail_id);
        DA = BP * 0.97;
        HRA = BP * 0.10;
        PF = BP * 0.12;
        CF = BP * 0.01;
        GP = BP + DA + HRA + PF;
        NP = GP - PF - CF;
        System.out.println("Basic Pay :" + BP);
        System.out.println("Dearness Allowance : " + DA);
        System.out.println("House Rent Allowance :" + HRA);
        System.out.println("Provident Fund :" + PF);
        System.out.println("Club Fund :" + CF);
        System.out.println("Gross Pay :" + GP);
        System.out.println("Net Pay :" + NP);
    }
}

class Programmer extends Employee {
    Programmer() {
        System.out.println("Enter Basic pay of the Programmer:");
        BP = get.nextFloat();
    }

    void display() {
        System.out.println("==============================" + "\n" + "Programmar Pay Slip" + "\n"
                + "==============================" + "\n");
        super.display();
    }
}

class Assistant_Professor extends Employee {
    Assistant_Professor() {
        System.out.println("Enter Basic pay of the Assistant Professor:");
        BP = get.nextFloat();
    }

    void display() {
        System.out.println("==============================" + "\n" + "Assistant Professor Pay Slip" + "\n"
                + "==============================" + "\n");
        super.display();
    }
}