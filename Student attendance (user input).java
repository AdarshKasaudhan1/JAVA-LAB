import java.util.Scanner;

class Student {
    private String student_id;
    private String student_name;

    Student(String student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public String getId() {
        return student_id;
    }

    public String getName() {
        return student_name;
    }
}

class Attendance {
    private Student student;
    private boolean present;

    Attendance(Student student, boolean present) {
        this.student = student;
        this.present = present;
    }

    public void checkAttendance() {
        String status;
        if (present) {
            status = "Present";
        } else {
            status = "Absent";
        }
        System.out.println("\nStudent Attendance Management System");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Status: " + status);
    }
}

public class studentattendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student 1 ID: ");
        String student1Id = scanner.nextLine();
        System.out.println("Enter Student 1 Name: ");
        String student1Name = scanner.nextLine();
        System.out.println("Is Student 1 Present (true/false): ");
        boolean student1Present = scanner.nextBoolean();
        scanner.nextLine();

        Student student1 = new Student(student1Id, student1Name);
        Attendance attendance1 = new Attendance(student1, student1Present);

        System.out.println("Enter Student 2 ID: ");
        String student2Id = scanner.nextLine();
        System.out.println("Enter Student 2 Name: ");
        String student2Name = scanner.nextLine();
        System.out.println("Is Student 2 Present (true/false): ");
        boolean student2Present = scanner.nextBoolean();

        Student student2 = new Student(student2Id, student2Name);
        Attendance attendance2 = new Attendance(student2, student2Present);

        attendance1.checkAttendance();
        attendance2.checkAttendance();


    }
}
