import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentDataStorage storage = new StudentDataStorage();

        // Adding students
        storage.addStudent(new Student(1, "John Doe", "Computer Science"));
        storage.addStudent(new Student(2, "Jane Smith", "Mathematics"));

        // Retrieving all students
        Map<Integer, Student> allStudents = storage.getAllStudents();
        for (Student student : allStudents.values()) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Course: " + student.getCourse());
            System.out.println("--------------");
        }

        // Updating a student's details
        Student updatedStudent = new Student(1, "John Doe", "Data Science");
        storage.updateStudent(updatedStudent);

        // Retrieving and printing the updated student
        Student retrievedStudent = storage.getStudent(1);
        System.out.println("Updated Course for John Doe: " + retrievedStudent.getCourse());

        // Deleting a student
        storage.deleteStudent(2);

        // Retrieving all students after deletion
        allStudents = storage.getAllStudents();
        for (Student student : allStudents.values()) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Course: " + student.getCourse());
            System.out.println("--------------");
        }
    }
}
