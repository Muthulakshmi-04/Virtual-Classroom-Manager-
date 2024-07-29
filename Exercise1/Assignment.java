/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
public class Assignment {
    private final String details;
    private final AssignmentStrategy strategy;

    public Assignment(String details, AssignmentStrategy strategy) {
        this.details = details;
        this.strategy = strategy;
    }

    public String getDetails() {
        return details;
    }

    public void handle() {
        strategy.handleAssignment();
    }
}

