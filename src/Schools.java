import java.util.Scanner;

public class Schools implements utility{
    String school_name;
    String district_name;
    String state_name;
    String principle_name;
    int total_student_strength;
    int total_teachers_strength;
    int total_workers_strength;


    @Override
    public void get_details() {
        System.out.println("SCHOOL NAME: "+ school_name);
        System.out.println("DISTRICT NAME: "+district_name);
        System.out.println("STATE NAME: "+state_name);
        System.out.println("PRINCIPLE NAME: "+principle_name);
        System.out.println("TOTAL STUDENT: "+ total_student_strength);
        System.out.println("TOTAL TEACHERS: "+ total_teachers_strength);
        System.out.println("TOTAL WORKERS"+ total_workers_strength);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================*** ENTER SCHOOL DETAILS ***==================================");
        System.out.println();
        System.out.println("SCHOOL NAME:");
        school_name = sc.nextLine();
        System.out.println("DISTRICT NAME: ");
        district_name = sc.nextLine();
        System.out.println("STATE NAME: ");
        state_name = sc.nextLine();
        System.out.println("PRINCIPLE NAME: ");
        principle_name = sc.nextLine();
        System.out.println("TOTAL STUDENT: ");
        total_student_strength = sc.nextInt();
        sc.nextLine();
        System.out.println("TOTAL TEACHERS: ");
        total_teachers_strength = sc.nextInt();
        sc.nextLine();
        System.out.println("TOTAL WORKERS: ");
        total_workers_strength = sc.nextInt();
        sc.nextLine();


    }
}



