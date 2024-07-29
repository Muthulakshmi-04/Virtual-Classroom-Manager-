/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise2;

/**
 *
 * @author LENOVO
 */
import java.util.*;

public class Classroom {
    private final String name;
    private final Map<String, Student> students = new HashMap<>();
    private final List<Assignment> assignments = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            throw new IllegalArgumentException("Student already enrolled.");
        }
        students.put(student.getId(), student);
    }

    public void scheduleAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void submitAssignment(String studentId, String assignmentDetails) {
        Student student = students.get(studentId);
        if (student == null) {
            throw new IllegalArgumentException("Student not found.");
        }
        Assignment assignment = findAssignment(assignmentDetails);
        student.submitAssignment(assignment);
    }

    private Assignment findAssignment(String assignmentDetails) {
        return assignments.stream()
                .filter(a -> a.getDetails().equals(assignmentDetails))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Assignment not found."));
    }
}

