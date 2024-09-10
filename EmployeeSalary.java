import java.io.*;
class Employee{
    String emp_name, mail_id, address, mobile, designation;
    int id,basic_pay;
    void input() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter the id: ");
        id = Integer.parseInt(d.readLine());
        System.out.print("Enter the Name: ");
        emp_name = d.readLine();
        System.out.print("Enter the Address: ");
        address = d.readLine();
        System.out.print("Enter Mobile number :");
        mobile = d.readLine();
        System.out.print("Enter the Mail id: ");
        mail_id = d.readLine();
    }
    void display(String designation, int basic_pay){
        float da = 0.97f*basic_pay;
        float hra = 0.1f*basic_pay;
        float pf = 0.12f*basic_pay;
        float sfclub = 0.001f*basic_pay;
        float gross_pay = basic_pay + da + hra;
        float net_pay = gross_pay - pf - sfclub;
        System.out.println("___________________________________________________");
        System.out.println("|EMPLOYEE DETAILS MAINTENANCE|");
        System.out.println("___________________________________________________");
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Mobile Number: " + mobile);
        System.out.println("Employee Mail Id: " + mail_id);
        System.out.println("Designation of an Employee: " + designation);
        System.out.println("Basic pay of an Employee: " + basic_pay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Gross Salary: " + gross_pay);
        System.out.println("PF: " + pf);
        System.out.println("Staff club amount: " + sfclub);
        System.out.println("Net pay: " + net_pay);
        System.out.println("___________________________________________________");
    }
}
class Lecturer extends Employee{
    void cal() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        designation = "Lecturer";
        System.out.print("Enter the basic pay of an Employee: ");
        basic_pay = Integer.parseInt(d.readLine());
        display(designation, basic_pay);
    }
}
class AP extends Employee{
    void cal() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        designation = "Assistant Professor";
        System.out.print("Enter the basic pay of an Employee: ");
        basic_pay = Integer.parseInt(d.readLine());
        display(designation, basic_pay);
    }
}
class Associate extends Employee{
    void cal() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        designation = "Associate Professor";
        System.out.print("Enter the basic pay of an Employee: ");
        basic_pay = Integer.parseInt(d.readLine());
        display(designation, basic_pay);
    }
}
class Professor extends Employee{
    void cal() throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        designation = "Professor";
        System.out.print("Enter the basic pay of an Employee: ");
        basic_pay = Integer.parseInt(d.readLine());
        display(designation, basic_pay);
    }
}
class EmployeeSalary{
    public static void main(String args[]) throws Exception{
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("1.Lecturer\n2.Assistant Professor\n3.Associate Professor\n4.Professor\nEnter the choice:");
        int ch = Integer.parseInt(d.readLine());
        switch(ch){
            case 1:
                Lecturer e = new Lecturer();
                e.input();
                e.cal();
                break;
            case 2:
                AP e1 = new AP();
                e1.input();
                e1.cal();
                break;
            case 3:
                Associate e2 = new Associate();
                e2.input();
                e2.cal();
                break;
            case 4:
                Professor e3 = new Professor();
                e3.input();
                e3.cal();
                break;
        }
    }
}