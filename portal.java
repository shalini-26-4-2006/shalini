import java.util.Scanner;

public class SimpleELearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] courses = {"Java", "Python", "Web Development"};
        String studentName = "";
        String enrolledCourse = "";

        System.out.println("=== E-Learning Portal ===");

        System.out.print("Enter your name: ");
        studentName = sc.nextLine();

        System.out.println("\nHello " + studentName + "!");
        System.out.println("Available Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }

        System.out.print("Choose a course number to enroll: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= courses.length) {
            enrolledCourse = courses[choice - 1];
            System.out.println(studentName + " enrolled in " + enrolledCourse);
        } else {
            System.out.println("Invalid course selection.");
        }

        sc.close();
    }
}
