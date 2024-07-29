/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
class AssignmentFactory {
    public static AssignmentStrategy createAssignment(String type) {
        switch (type) {
            case "quiz":
                return new QuizAssignment();
            case "project":
                return new ProjectAssignment();
            case "essay":
                return new EssayAssignment();
            default:
                throw new IllegalArgumentException("Unknown assignment type.");
        }
    }
}

