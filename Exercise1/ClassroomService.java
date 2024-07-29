/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
import java.util.*;

public class ClassroomService {
    private final Map<String, Classroom> classrooms = new HashMap<>();

    public void addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            throw new IllegalArgumentException("Classroom already exists.");
        }
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom " + className + " has been created.");
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = getClassroom(className);
        classroom.addStudent(new Student(studentId));
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = getClassroom(className);
        AssignmentStrategy assignment = AssignmentFactory.createAssignment(assignmentDetails);
        classroom.scheduleAssignment(new Assignment(assignmentDetails, assignment));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = getClassroom(className);
      //  classroom.submitAssignment(studentId, assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    private Classroom getClassroom(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new IllegalArgumentException("Classroom not found.");
        }
        return classroom;
    }
}

