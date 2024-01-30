import java.util.HashMap;
import java.util.Map;

public class StudentDataStorage {

    private Map<Integer, Student> students;

    public StudentDataStorage() {
        this.students = new HashMap<>();
    }

    // Add a new student to the storage
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    // Retrieve a student by ID
    public Student getStudent(int studentId) {
        return students.get(studentId);
    }

    // Retrieve all students
    public Map<Integer, Student> getAllStudents() {
        return new HashMap<>(students);
    }

    // Update details of an existing student
    public void updateStudent(Student student) {
        if (students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        }
    }

    // Delete a student by ID
    public void deleteStudent(int studentId) {
        students.remove(studentId);
    }
}
