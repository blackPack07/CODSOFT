//    CodSoft Java Development Internship Task 04 : Student Management System


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentInfo {     //This class contains student identity methods

    String name;
    int rollNumber;
    String grade;
    String fatherName;
    Long contact;

    public StudentInfo(String name, int rollNumber, String grade, String fatherName, Long contact) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.fatherName = fatherName;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Long getContact() {
        return contact;
    }
}

    class SMS extends StudentInfo {    // SMS - Student Management System

        // StudentInfo sInfo = new StudentInfo(name, getRollNumber(), name, name, getContact());
        private List<StudentInfo> students;

        public SMS() {
        students = new ArrayList<>();     // initialize array as students in which stores student identity
        }

        public void addStudent(StudentInfo student) {
            students.add(student);
            System.out.println("Student Added!");
            System.out.println("\n\n");
        }

        public void removeStudent(int rollNumber) {
            boolean removed = false;
            for (int i = 0; i < students.size(); i++) {
                StudentInfo student = students.get(i);
                if (student.getRollNumber() == rollNumber) {
                    students.remove(i);
                    removed = true;
                    System.out.println("Student Removd!");
                    System.out.println("\n");
                    break;
                }
            }
            if (!removed) {
                System.out.println("Student not found having Roll no. " + rollNumber);
                System.out.println("\n");
            }
    
        }


        public void searchStudent(int rollNumber) {
            for (StudentInfo student : students) {
                if (student.getRollNumber() == rollNumber) {
                    System.out.println("Student found");
                    System.out.println("Name : " + student.getName());
                    System.out.println("Roll No. " + student.getRollNumber());
                    System.out.println("Grade : " + student.getGrade());
                    System.out.println("Father's Name : " + student.getFatherName());
                    System.out.println("Contact : " + student.getContact());
                    System.out.println("\n");
                    return;
                }
            }
            System.out.println("Student not found with roll number: " + rollNumber);
            System.out.println("\n");
        }

        public void displayAllStudents() {
            if (students.isEmpty()) {
                System.out.println("    !! ERROR : Students Data Not Found  !!");
            } else {
                System.out.println("All Students Listed Below;\n");
                for (StudentInfo student : students) {
                    System.out.println("Student with identity,");
                    System.out.println("Name : " + student.getName());
                    System.out.println("Roll No. " + student.getRollNumber());
                    System.out.println("Grade : " + student.getGrade());
                    System.out.println("Father's Name : " + student.getFatherName());
                    System.out.println("Contact : " + student.getContact());
                    System.out.println("\n");
                }
            }
        }
    }

public class T4_SMS{
    public static void main(String[] args) {
        SMS system = new SMS();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("!!   Welcome to Student Management System   !!");
            System.out.println("Enter 1 for Adding a student");
            System.out.println("Enter 2 for Removing a student");
            System.out.println("Enter 3 for finding a student");
            System.out.println("Enter 4 for Displaying All Students");
            System.out.println("Enter 5 for exit.");
            System.out.println();
            System.out.print("Choose a button : ");

            int button = scan.nextInt();
            scan.nextLine();
            System.out.println("\n\n");

            switch (button) {
                case 1:
                    System.out.print("Enter Name : ");
                    String name = scan.nextLine();

                    System.out.print("Enter Roll No. ");
                    int rollNumber = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter grade: ");
                    String grade = scan.nextLine();

                    System.out.print("Enter Father's Name : ");
                    String fatherName = scan.nextLine();

                    System.out.print("Enter student's Contact No. ");
                    Long contact = scan.nextLong();

                    StudentInfo student = new StudentInfo(name, rollNumber, grade, fatherName, contact);
                    system.addStudent(student);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("Enter roll number of the student to remove : ");
                    int removeRollNumber = scan.nextInt();
                    scan.nextLine();

                    system.removeStudent(removeRollNumber);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("Enter roll number of the student to search : ");
                    int searchRollNumber = scan.nextInt();
                    scan.nextLine();

                    system.searchStudent(searchRollNumber);
                    System.out.println("\n");
                    break;

                case 4:
                    system.displayAllStudents();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("!!!  Invalid button   !!!\nPlease type an approriate button.");
                    System.out.println("\n");
                    break;
            }
        }
    }
}
