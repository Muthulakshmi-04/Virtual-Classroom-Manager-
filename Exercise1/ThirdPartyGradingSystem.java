/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
class ThirdPartyGradingSystem {
    public void grade(String assignmentDetails) {
        System.out.println("Grading assignment: " + assignmentDetails);
    }
}

interface GradingSystem {
    void gradeAssignment(String details);
}

class GradingSystemAdapter implements GradingSystem {
    private final ThirdPartyGradingSystem thirdPartyGradingSystem;

    public GradingSystemAdapter(ThirdPartyGradingSystem thirdPartyGradingSystem) {
        this.thirdPartyGradingSystem = thirdPartyGradingSystem;
    }

    @Override
    public void gradeAssignment(String details) {
        thirdPartyGradingSystem.grade(details);
    }
}

