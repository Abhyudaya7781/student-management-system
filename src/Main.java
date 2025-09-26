import java.util.*;

public class Main {
    public static void main(String[] args) {
        Database.init();
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Course: ");
                String course = sc.next();
                System.out.print("Enter GPA: ");
                double gpa = sc.nextDouble();
                dao.addStudent(new Student(id, name, course, gpa));
            } else if (choice == 2) {
                List<Student> students = dao.getAllStudents();
                for (Student s : students) System.out.println(s);
            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                Student s = dao.searchStudent(id);
                if (s == null) System.out.println("Student not found.");
                else System.out.println(s);
            } else if (choice == 4) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                System.out.print("Enter New Name: ");
                String name = sc.next();
                System.out.print("Enter New Course: ");
                String course = sc.next();
                System.out.print("Enter New GPA: ");
                double gpa = sc.nextDouble();
                dao.updateStudent(new Student(id, name, course, gpa));
            } else if (choice == 5) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                dao.deleteStudent(id);
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}
