/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class VirtualClassroomManager {
    private static final ClassroomService classroomService = new ClassroomService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ", 2);

            if (tokens.length < 2) {
                System.out.println("Invalid command.");
                continue;
            }

            String command = tokens[0];
            String details = tokens[1];

            try {
                switch (command) {
                    case "add_classroom":
                        classroomService.addClassroom(details);
                        break;
                    case "add_student":
                        String[] studentDetails = details.split(" ");
                        classroomService.addStudent(studentDetails[0], studentDetails[1]);
                        break;
                    case "schedule_assignment":
                        String[] assignmentDetails = details.split(" ", 2);
                        classroomService.scheduleAssignment(assignmentDetails[0], assignmentDetails[1]);
                        break;
                    case "submit_assignment":
                        String[] submissionDetails = details.split(" ", 3);
                        classroomService.submitAssignment(submissionDetails[0], submissionDetails[1], submissionDetails[2]);
                        break;
                    default:
                        System.out.println("Unknown command.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

