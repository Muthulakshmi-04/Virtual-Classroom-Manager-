/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
public class ClassroomManager {
    private static ClassroomManager instance;
    private final ClassroomService classroomService;

    private ClassroomManager() {
        classroomService = new ClassroomService();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public ClassroomService getClassroomService() {
        return classroomService;
    }
}

