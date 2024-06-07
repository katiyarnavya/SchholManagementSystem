import java.util.Scanner;

public class Students extends Schools implements utility{
    String student_name;
    String address;
    String school_name;
    String principle_name;
    String fathers_name;
    int age;
    int class_name;


    @Override
    public void get_details() {
        System.out.println("STUDENT NAME: "+ student_name);
        System.out.println("SCHOOL NAME: "+school_name);
        System.out.println("ADDRESS: "+ address);
        System.out.println("FATHERS NAME: "+fathers_name);
        System.out.println("PRINCIPLE NAME: "+ principle_name);
        System.out.println("AGE: "+ age);
        System.out.println("CLASS : "+ class_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================*** ENTER STUDENT DETAILS ***==================================");
        System.out.println();
        System.out.println("STUDENT NAME: ");
        student_name = sc.nextLine();
        System.out.println("SCHOOL NAME: ");
        school_name = sc.nextLine();
        System.out.println("ADDRESS: ");
        address = sc.nextLine();
        System.out.println("FATHER'S NAME: ");
        fathers_name = sc.nextLine();
        System.out.println("PRINCIPAL'S NAME: ");
        principle_name= sc.nextLine();
        System.out.println("AGE: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("STANDARD: ");
        class_name = sc.nextInt();
        sc.nextLine();
    }
}
