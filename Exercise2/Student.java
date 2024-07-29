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

public class Student {
    private final String id;
    private final List<Assignment> submittedAssignments = new ArrayList<>();

    public Student(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void submitAssignment(Assignment assignment) {
        if (submittedAssignments.contains(assignment)) {
            throw new IllegalArgumentException("Assignment already submitted.");
        }
        submittedAssignments.add(assignment);
    }
}

