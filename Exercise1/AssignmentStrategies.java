/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
interface AssignmentStrategy {
    void handleAssignment();
}

class QuizAssignment implements AssignmentStrategy {
    @Override
    public void handleAssignment() {
        System.out.println("Handling quiz assignment.");
    }
}

class ProjectAssignment implements AssignmentStrategy {
    @Override
    public void handleAssignment() {
        System.out.println("Handling project assignment.");
    }
}

class EssayAssignment implements AssignmentStrategy {
    @Override
    public void handleAssignment() {
        System.out.println("Handling essay assignment.");
    }
}
