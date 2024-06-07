import java.util.Scanner;
import java.lang.*;
interface utility{
    public void get_details();
    public void set_details();

}

public class Main {
    static void main_menu() {
        System.out.println("========================*** WELCOME TO SCHOOL MANAGEMENT SYSTEM ***======================");
        System.out.println();
        System.out.println("=======================*** ENTER THE KEY WHERE YOU WANT TO GO ***========================");
        System.out.println();
        System.out.println("1]. ADD SCHOOLS \t\t2]. ADD TEACHERS \t\t 3]. ADD STUDENTS \t\t 4]. ADD WORKERS");
        System.out.println();
        System.out.println("5]. GET SCHOOLS \t\t 6]. GET TEACHERS \t\t 7]. GET STUDENTS \t\t 8]. GET WORKERS");
        System.out.println();
        System.out.println("=============================*** ENTER 0 TO EXIT ***===================================");
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Schools school[] = new Schools[10];
        Students student[] = new Students[10];
        Teachers teachers[] = new Teachers[10];
        Workers worker[] = new Workers[10];
        int school_counter = 0;
        int teachers_counter = 0;
        int student_counter = 0;
        int workers_counter = 0;
        int choice = 100;
        while(choice != 0){
            main_menu();
            choice = sc.nextInt();
            while(choice != 0 && choice != 9){
                switch(choice) {
                    case 1:
                        school[school_counter] = new Schools();
                        school[school_counter].set_details();
                        school_counter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW SCHOOL");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        teachers[teachers_counter] = new Teachers();
                        teachers[teachers_counter].set_details();
                        teachers_counter++;
                        System.out.println();
                        System.out.println("2]. ADD NEW TEACHER");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        student[student_counter] = new Students();
                        student[student_counter].set_details();
                        student_counter++;
                        System.out.println();
                        System.out.println("3]. ADD NEW STUDENT");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        worker[workers_counter] = new Workers();
                        worker[workers_counter].set_details();
                        workers_counter++;
                        System.out.println();
                        System.out.println("4]. ADD NEW WORKER");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < school_counter; i++) {
                            school[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < teachers_counter; i++) {
                            teachers[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 7:
                        for (int i = 0; i < student_counter; i++) {
                            student[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 8:
                        for (int i = 0; i < workers_counter; i++) {
                            worker[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0]. EXIT");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;

                }
            }
        }

    }
}








