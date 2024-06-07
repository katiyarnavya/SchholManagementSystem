import java.util.Scanner;

public class Workers extends Schools implements utility{
    String worker_name;
    String school_name;
    String address;
    String profession;
    int age;


    @Override
    public void get_details() {
        System.out.println("WORKER NAME: "+ worker_name);
        System.out.println("SCHOOL NAME: "+ school_name);
        System.out.println("ADDRESS: "+ address);
        System.out.println("PROFESSION: "+profession);
        System.out.println("AGE: "+ age);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================*** ENTER STUDENT DETAILS ***==================================");
        System.out.println();
        System.out.println("WORKER' NAME: ");
        worker_name = sc.nextLine();
        System.out.println("SCHOOL NAME: ");
        school_name = sc.nextLine();
        System.out.println("ADDERSS: ");
        address = sc.nextLine();
        System.out.println("PROFESSION: ");
        profession= sc.nextLine();
        System.out.println("AGE: ");
        age = sc.nextInt();
        sc.nextLine();
    }
}
