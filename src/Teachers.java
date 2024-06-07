import java.util.Scanner;

public class Teachers extends Schools implements utility{
    String teacher_name;
    String address;
    String subject;
    String school_name;
    String principle_name;
    int age;
    int salary;



    @Override
    public void get_details() {
        System.out.println("TEACHER NAME: "+ teacher_name);
        System.out.println("SCHOOL NAME: "+school_name);
        System.out.println("ADDRESS: "+ address);
        System.out.println("SUBJECT: "+subject);
        System.out.println("PRINCIPLE NAME: "+principle_name);
        System.out.println("AGE: "+ age);
        System.out.println("SALARY: "+ salary);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================*** ENTER TEACHERS DETAILS ***==================================");
        System.out.println();
        System.out.println("TEACHER NAME: ");
        teacher_name = sc.nextLine();
        System.out.println("ADDRESS: ");
        address = sc.nextLine();
        System.out.println("COURSE EXPERT");
        subject = sc.nextLine();
        System.out.println("SCHHOL NAME: ");
        school_name = sc.nextLine();
        System.out.println("PRINCIPAL NAME: ");
        principle_name= sc.nextLine();
        System.out.println("AGE: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("SALARY: ");
        salary = sc.nextInt();
        sc.nextLine();
    }
}
